(ns academic-phrases-web.core-test
  (:require [cljs.test :refer-macros [deftest is]]
            [academic-phrases-web.core :as c]))


(deftest gen-cats-keywords-test
  (is (= (c/gen-cats-keywords 1 3)
         [:cat1 :cat2 :cat3])))

(deftest get-item-by-id-test
  (is (= (c/get-item-by-id 1)
         {:id 1
          :template "X is the [{1}] cause of ..."
          :choices [["main" "leading" "primary" "major"]]})))

(deftest get-items-by-ids-test
  (is (= (c/get-items-by-ids [1])
         [{:id 1
           :template "X is the [{1}] cause of ..."
           :choices [["main" "leading" "primary" "major"]]}]))

  (is (= (c/get-items-by-ids [1 2])
         [{:id 1
           :template "X is the [{1}] cause of ..."
           :choices [["main" "leading" "primary" "major"]]}
          {:id 2
           :template "Xs are a [{1}] part of ..."
           :choices [["common" "useful" "critical"]]}])))

(deftest get-topic-title-by-cat-test
  (is (= (c/get-topic-title-by-cat :cat1)
         "Establishing why your topic X is important")))

(deftest get-topics-titles-by-cats-test
  (is (= (c/get-topics-titles-by-cats [:cat1])
         ["Establishing why your topic X is important"]))

  (is (= (c/get-topics-titles-by-cats [:cat1 :cat2])
         ["Establishing why your topic X is important"
          "Outlining the past-present history of the study of X"])))

(deftest get-items-by-title-test
  (is (= (c/get-items-by-title "Establishing why your topic X is important")
         [{:id 1 :template "X is the [{1}] cause of ..." :choices [["main" "leading" "primary" "major"]]}
          {:id 2 :template "Xs are a [{1}] part of ..." :choices [["common" "useful" "critical"]]}
          {:id 3 :template "Xs are among the most [{1}] types of ..." :choices [["widely used" "commonly discussed" "well-known" "well-documented" "widespread" "commonly investigated"]]}
          {:id 4 :template "X is [{1}] the most important ..." :choices [["is recognized as being" "believed to be" "widely considered to be"]]}
          {:id 5 :template "It is [{1}] that X is ..." :choices [["well known" "generally accepted" "common knowledge"]]}
          {:id 6 :template "X [{1}] a vital factor in ..." :choices [["is increasingly becoming" "set to become"]]}
          {:id 7 :template "Xs are [{1}] in terms of ..." :choices [["undergoing a revolution" "generating considerable interest"]]}
          {:id 8 :template "Xs are attracting [{1}] interest due to ..." :choices [["considerable" "increasing" "widespread"]]}
          {:id 9 :template "X has many [{1}] in the field of ..." :choices [["uses" "roles" "applications"]]}
          {:id 10 :template "A [{1}] feature of ..." :choices [["striking" "useful" "remarkable"]]}
          {:id 11 :template "The [{1}] characteristics of X are:" :choices [["main" "principal" "fundamental"]]}
          {:id 12 :template "X [{1}] for" :choices [["accounts" "is responsible"]]}])))

(deftest mark-placeholders-test
  (is (= (c/mark-placeholders "X is the __ cause of ...")
         [:div "X is the " [:mark "__"] " cause of ..."]))

  (is (= (c/mark-placeholders "This sentence has one __ two __ three __ options")
         [:div "This sentence has one " [:mark "__"] " two " [:mark "__"] " three " [:mark "__"] " options"])))
