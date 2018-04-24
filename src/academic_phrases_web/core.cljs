(ns academic-phrases-web.core
  (:require [academic-phrases-web.phrases :refer [all-phrases]]
            [reagent.core :as reagent]
            [clojure.string :as s]
            [cljsjs.clipboard]
            [com.rpl.specter :as S :refer-macros [select select-one ALL MAP-VALS collect]]))


(enable-console-print!)


(defonce app-state (reagent/atom {:template ""
                                  :choice1 ""
                                  :choice2 ""
                                  :choice3 ""
                                  :sentence-id 0
                                  :topics []
                                  :topic-title ""
                                  :section ""}))

(def uniqkey (atom 0))

(defn gen-key []
  (let [res (swap! uniqkey inc)]
    res))

(defn gen-cats-keywords [s e]
  (into [] (map #(keyword (str "cat" %)) (range s e))))

(defn gen-options-group [idx choices]
  ^{:key (str idx)}
  [:select {:on-change #(swap! app-state assoc-in [(keyword (str "choice" (str (inc idx))))] (-> % .-target .-value))}
   [:option "__"]
   (for [choice choices]
     ^{:key (str choice idx (gen-key))}
     [:option choice]
     )])

(def secs-cats {:abstract [:cat1 :cat2 :cat4 :cat5]
                :intro (gen-cats-keywords 1 16)
                :review (conj (gen-cats-keywords 9 16) :cat4)
                :methods (gen-cats-keywords 17 30)
                :results (gen-cats-keywords 29 40)
                :discussion (gen-cats-keywords 35 45)
                :conclusion (gen-cats-keywords 45 51)
                :acknowledgments [:cat52]
                :all (gen-cats-keywords 1 57)})

(defn replace-placeholder []
  (let [tmp (:template @app-state)
        ch1 (:choice1 @app-state)
        ch2 (:choice2 @app-state)
        ch3 (:choice3 @app-state)]
    (s/replace tmp #"\[\{1\}\]|\[\{2\}\]|\[\{3\}\]"
               {"[{1}]" ch1 "[{2}]" ch2 "[{3}]" ch3})))

(defn get-item-by-id [id]
  (S/select-one (S/walker #(= (:id %) id)) all-phrases))

(defn get-items-by-ids [ids]
  (mapv get-item-by-id ids))

(defn get-ids-by-cats [cats]
  (S/select [(S/submap cats) S/ALL S/ALL :items S/ALL :id] all-phrases))

(defn get-all-titles []
  (S/select [S/MAP-VALS :title] all-phrases))

(defn get-topic-title [topic-id]
  (let [cat (keyword (str "cat" topic-id))]
    (S/select-one [cat :title] all-phrases)))

(defn get-topic-title-by-cat [cat]
  (S/select-one [cat :title] all-phrases))

(defn get-topics-titles-by-cats [cats]
  (mapv get-topic-title-by-cat cats))

(defn get-items-by-title [title]
  (S/select [(S/walker #(= (:title %) title)) :items S/ALL] all-phrases))

(defn update-topics! [titles]
  (swap! app-state assoc :topics titles))

(defn select-html [id]
  (let [chs (:choices (get-item-by-id id))]
    (map-indexed gen-options-group chs)))

(defn dyn-sent [id]
  (let [item (get-item-by-id id)
        template (:template item)
        split-tmp (s/split template #"\[\{1\}\]|\[\{2\}\]|\[\{3\}\]")
        choices (:choices item)
        select (concat (select-html id) " ")
        sentence (-> split-tmp
                     (->> (map (fn [i] ^{:key (str i)} [:span i])))
                     (interleave select))]
    sentence))

(defn mount-component [comp]
  (reagent/render-component [comp] (. js/document (getElementById "main-body"))))

(defn reset-choices []
  (do
    (swap! app-state assoc :choice1 "")
    (swap! app-state assoc :choice2 "")
    (swap! app-state assoc :choice3 "")))

(defn clipboard-button [label target]
  (let [clipboard-atom (reagent/atom nil)]
    (reagent/create-class
     {:display-name "clipboard-button"
      :component-did-mount
      #(let [clipboard (new js/Clipboard (reagent/dom-node %))]
         (reset! clipboard-atom clipboard))
      :component-will-unmount
      #(when-not (nil? @clipboard-atom)
         (.destroy @clipboard-atom)
         (reset! clipboard-atom nil))
      :reagent-render
      (fn []
        [:button.btn.btn-primary.clipboard
         {:data-clipboard-target target
          :style {:visibility (if (empty? (:choice1 @app-state)) "hidden" "visible")}
          }
         label])})))

(defn sent-ui []
  [:div.animated.fadeIn.text-center
   (dyn-sent (:sentence-id @app-state))
   [:div.empty
    [:h4.animated.fadeIn {:id "copy-this"
                          :style {:visibility (if (empty? (:choice1 @app-state)) "hidden" "visible")}}
     (replace-placeholder)]
    [:div.empty-action
     [clipboard-button "Copy" "#copy-this"]]]])

(defn mark-placeholders [sent]
  (let [split-sent (s/split sent #"__")
        inter-sent (interpose ^{:key (str sent (gen-key))} [:mark "__"] split-sent)]
    (if (= (count split-sent) 1)
      (cons inter-sent [[:mark "__"]])
      inter-sent)))

(defn sent-card [sent]
  ^{:key (str "sent-card-" sent)}
  [:tr.c-hand {:on-click #(do
                            (swap! app-state assoc :sentence-id (:id sent))
                            (swap! app-state assoc :template (:template sent))
                            (reset-choices)
                            (mount-component sent-ui))}
   [:td (mark-placeholders (s/replace (:template sent) #"\[\{1\}\]|\[\{2\}\]|\[\{3\}\]" "__"))]
   [:td
    [:button.btn.btn-primary.float-right
     {:on-click #(do
                   (swap! app-state assoc :sentence-id (:id sent))
                   (swap! app-state assoc :template (:template sent))
                   (reset-choices)
                   (mount-component sent-ui))} [:i.icon.icon-forward]]]])

(defn topic-ui []
  (let [title (:topic-title @app-state)]
    (fn []
      [:div.animated.fadeIn.text-center
       [:table.table.table-hover
        [:tbody
         (map
          (fn [t]
            (sent-card t))
          (get-items-by-title title))]]])))

(defn topic-card [topic]
  ^{:key (:topic-title topic)}
  [:table.table.table-hover
   [:tbody
    [:tr.c-hand {:on-click #(do
                              (swap! app-state assoc :topic-title topic)
                              (mount-component topic-ui))}
     [:td [:strong topic]]
     [:td
      [:button.btn.btn-primary.float-right
       {:on-click #(do
                     (swap! app-state assoc :topic-title topic)
                     (mount-component topic-ui))} [:i.icon.icon-forward]]]]]])

(defn topics-ui []
  [:div.animated.fadeIn
   [:input {:placeholder "Search" :class "form-input" :type "text"
            :on-change (fn [e] (swap! app-state assoc :topics
                                      (into [] (filter (fn [t]
                                                         (s/includes? (s/lower-case t) (-> e .-target .-value s/lower-case)))
                                                       (get-topics-titles-by-cats ((:section @app-state) secs-cats))))))}]
   [:div (map (fn [t] ^{:key t}[topic-card t]) (:topics @app-state))]])

(defn sections-ui []
  (let [secs ["All" "Abstract" "Intro" "Review" "Methods" "Results" "Discussion" "Conclusion" "Acknowledgments"]]
    (fn []
      [:div.animated.fadeIn
       [:table.table.table-hover
        [:tbody
         (for [sec secs]
           ^{:key sec}
           [:tr.c-hand
            [:td {:on-click #(do
                               (swap! app-state assoc :section (keyword (s/lower-case sec)))
                               (update-topics! (get-topics-titles-by-cats ((:section @app-state) secs-cats)))
                               (mount-component topics-ui))}
             [:strong sec]]
            [:td [:button.btn.btn-primary.float-right [:i.icon.icon-forward]]]])]]])))

(defn header-ui []
  [:div.columns
   [:div.column.col-12
    [:h2#site-header.text-center "Academic Phrases"]
    [:h6.text-center.text-gray "Bypass that mental block when writing your papers"]
    [:div.divider]]])

(defn breadcrumb-ui []
  [:div.columns
   [:div.column.col-12
    [:ul.breadcrumb
     [:li.breadcrumb-item.c-hand [:a.tooltip.tooltip-right {:on-click #(do
                                                                         (swap! app-state assoc :section "")
                                                                         (swap! app-state assoc :topic-title "")
                                                                         (mount-component sections-ui))
                                                            :data-tooltip "Browse phrases by the paper sections"} "Section"]]
     (when (not= (:section @app-state) "")
       [:li.breadcrumb-item [:a {:on-click #(do
                                              (swap! app-state assoc :topic-title "")
                                              (mount-component topics-ui))}
                             (s/capitalize (name (:section @app-state)))]])
     (when (not= (:topic-title @app-state) "")
       [:li.breadcrumb-item [:a {:on-click #(mount-component topic-ui)} (:topic-title @app-state)]])]
    [:div.divider.text-center {:data-content "🎓"}]]])

(defn footer-ui []
  [:div
   [:div.columns.bg-gray
    [:div.column.col-12
     [:div#footer-p.text-gray.text-center
      [:span "This work was based on the freely available PDF titled “English for
      Writing Research - Papers Useful Phrases” which can be found "]
      [:span [:a {:href "http://www.springer.com/gb/book/9783319260921"} "here."]]
      [:br]
      [:span "This work was done with the kind permission of Springer Nature and Adrian Wallwork."]]]]

   [:div.columns.bg-gray
    [:div.column.col-12.text-center
     [:img.centered.circle {:src "./img/avatar.jpg" :width "34px"}]
     [:a.btn.btn-link {:href "https://twitter.com/nashamri"} "Twitter"]
     [:a.btn.btn-link {:href "https://github.com/nashamri/academic-phrases-web"} "GitHub"]]]])

(defn main-ui []
  [:div.container
   (header-ui)
   (breadcrumb-ui)
   [:div#main-body {:style {:max-"100%"}}]
   (footer-ui)])

(reagent/render-component [main-ui]
                          (. js/document (getElementById "app")))

(reagent/render-component [sections-ui]
                          (. js/document (getElementById "main-body")))

