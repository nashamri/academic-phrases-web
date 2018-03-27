(ns academic-phrases-web.core
  (:require [academic-phrases-web.phrases :refer [all-phrases]]
            [reagent.core :as reagent :refer [atom]]
            [clojure.string :as s]
            [com.rpl.specter :as S :refer-macros [select select-one ALL MAP-VALS]]))


(enable-console-print!)

(defonce app-state (atom {:template "Before [{2}] interpreting our results, we [{1}] our main aims [{3}]."
                          :choice1 ""
                          :choice2 ""
                          :choice3 ""
                          :sentence ""
                          :show-sentence? false
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

(defn root-html []
  [:div.animated.fadeIn
   (dyn-sent 284)
   [:h1 {:class (if (:show-sentence? @app-state) "fade-in" "fade-out")} (replace-placeholder)]
   [:button.siimple-btn.siimple-btn--blue {:on-click #(swap! app-state update :show-sentence? not)} "toggle"]
   [:h1 (str (:show-sentence? @app-state))]
   [:button.siimple-btn.siimple-btn--blue
    {:on-click #(reagent/render-component [entry-html] (. js/document (getElementById "app")))} "Swap!"]
   ])

(defn entry-html []
  [:div.animated.fadeIn
   [:button.siimple-btn.siimple-btn--blue {:on-click #(update-topics! (get-all-titles))} "Topics"]
   [:button.siimple-btn.siimple-btn--blue
    {:on-click #(reagent/render-component [root-html] (. js/document (getElementById "app")))} "Swap!"]
   [:hr]
   (take 10 (map (fn [t] ^{:key t}[:p.animated.fadeInUp t]) (:topics @app-state)))
   ;; [:h4 (str (:topics @app-state))]
   ])

(reagent/render-component [entry-html]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )
