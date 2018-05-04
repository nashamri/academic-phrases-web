(ns academic-phrases-web.core-test
  (:require [cljs.test :refer-macros [deftest is]]))


(deftest i-should-fail
  (is (= 1 0)))

(deftest i-should-suc
  (is (= 1 1)))
