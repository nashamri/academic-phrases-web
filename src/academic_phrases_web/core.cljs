(ns academic-phrases-web.core
  (:require [reagent.core :as reagent :refer [atom]]
            [clojure.string :as s]))


(enable-console-print!)

(defonce app-state (atom {:template "Before [{2}] interpreting our results, we [{1}] our main aims [{3}]."
                          :choice1 ""
                          :choice2 ""
                          :choice3 ""}))

(def phrases
       {:cat56 {:title "Referring back to your research aim"
                :items [
                        {:id 585
                         :template "As stated in the Introduction, our main [{1}] was to ..."
                         :choices [["aim" "objective" "target" "purpose" "goal"]]}
                        {:id 586
                         :template "As stated in the Introduction, the research [{1}] in order to ..."
                         :choices [["was conducted" "undertaken" "carried out"]]}
                        {:id 587
                         :template "[{1}] our main aim was, as mentioned in the Introduction, to ..."
                         :choices [["Given that" "Since"]]}
                        {:id 588
                         :template "Before interpreting our results, we [{1}] our main aims."
                         :choices [["remind the reader of" "would just like to restate"]]}
                        {:id 589
                         :template "Returning to the [{1}] posed at the beginning of this study, it is now possible to state that ..."
                         :choices [["hypothesis" "question"]]}
                       ]}})


(defn replace-placeholder []
  (let [tmp (:template @app-state)
        ch1 (:choice1 @app-state)
        ch2 (:choice2 @app-state)
        ch3 (:choice3 @app-state)]
    (s/replace tmp #"\[\{1\}\]|\[\{2\}\]|\[\{3\}\]"
               {"[{1}]" ch1 "[{2}]" ch2 "[{3}]" ch3})))

(defn sentence-html []
  [:div
   [:span "Before interpreting our results, we "]
   [:select {:on-click #(swap! app-state assoc-in [:choice1] (-> % .-target .-value))}
             [:option "remind the reader of"][:option "would just like to restate"]]
   [:span " our main aims."]
   [:h1 (replace-placeholder)]])

(reagent/render-component [sentence-html]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
