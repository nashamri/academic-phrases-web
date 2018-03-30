(ns academic-phrases-web.core
  (:require [academic-phrases-web.phrases :refer [all-phrases]]
            [reagent.core :as reagent :refer [atom]]
            [clojure.string :as s]
            [com.rpl.specter :as S :refer-macros [select select-one ALL MAP-VALS]]))


(enable-console-print!)

(defonce app-state (atom {:template "First we [{1}] the value of X [{2}], we [{3}] Y."
                          :choice1 ""
                          :choice2 ""
                          :choice3 ""
                          :sentence ""
                          :topics []}))


(defn replace-placeholder []
  (let [tmp (:template @app-state)
        ch1 (:choice1 @app-state)
        ch2 (:choice2 @app-state)
        ch3 (:choice3 @app-state)]
    (s/replace tmp #"\[\{1\}\]|\[\{2\}\]|\[\{3\}\]"
               {"[{1}]" ch1 "[{2}]" ch2 "[{3}]" ch3})))

(defn get-item-by-id [id]
  (S/select-one (S/walker #(= (:id %) id)) all-phrases))

(defn gen-options-group [idx choices]
  [:select {:on-click #(swap! app-state assoc-in [(keyword (str "choice" (str (inc idx))))] (-> % .-target .-value))}
   (for [choice choices]
     [:option choice])])

(defn get-all-titles []
  (S/select [S/MAP-VALS :title] all-phrases))

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
                     (->> (map (fn [i] [:span i])))
                     (interleave select))]
    sentence))

(defn sent-ui []
  [:div.animated.fadeIn
   (dyn-sent 284)
   [:h1.animated.fadeIn (replace-placeholder)]
   ])

(defn topics-ui []
  [:div.animated.fadeIn
   [:button.siimple-btn.siimple-btn--blue {:on-click #(update-topics! (get-all-titles))} "All Topics"]
   [:button.siimple-btn.siimple-btn--blue {:on-click #(swap! app-state assoc :topics [])} "Clear Topics"]
   (take 10 (map (fn [t] ^{:key t}[:p.animated.fadeInUp t]) (:topics @app-state)))
   ])

(defn mount-component [comp]
  (reagent/render-component [comp] (. js/document (getElementById "main-body"))))

(defn main-ui []
  [:div
   [:button.siimple-btn.siimple-btn--blue {:on-click #(mount-component topics-ui)} "topics"]
   [:button.siimple-btn.siimple-btn--blue {:on-click #(mount-component sent-ui)} "sentences"]
   [:hr]
   [:div#main-body]
   ;; [:p (str (:topics @app-state))]
   ])

(reagent/render-component [main-ui]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )
