;; scalars5.clj
;; Make me compile! Scroll down for hints :)

(ns scalars.scalars5
  (:require [clojure.test :refer [deftest testing is]]))

(deftest test-scalars5
  (let [x ???] ;; complete the code here!
    (is (keyword? x))))






























;; Keywords are identifiers that evaluate to themselves, and are used in
;; Clojure to provide fast equality checks.
;; https://clojure.org/reference/data_structures#Keywords