;; test2.clj
;; This is a test for the following sections:
;; - Tests

;; This test isn't testing our function -- make it do that in such a way that
;; the test passes. Then write a second test that tests that we get the result
;; we expect to get when we call `times-two` with a negative number.
;; No hints, you can do this :)

(ns test2
  (:require [clojure.test :refer [deftest is]]))

(defn times-two [n]
  (* n 2))

(deftest returns-twice-of-positive-number
  (is (= (times-two 4) ???)))

(deftest returns-twice-of-negative-number
  ;; TODO: write a test for (times-two -4)
  )
