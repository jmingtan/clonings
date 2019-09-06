;; testing3.clj
;; This test isn't testing our function -- make it do that in such a way that
;; the test passes. Then write a second test that tests whether we get the result
;; we expect to get when we call `(is-even? 5)`. Scroll down for hints!

(ns testing.testing3
  (:require [clojure.test :refer [deftest is]]))

(defn is-even? [n]
  (= (mod n 2) 0))

(deftest is-true-when-even
  (is))































;; You can call a function right where you're passing arguments to `is` -- so you could do
;; something like `(is (having-fun))`. If you want to check that you indeed get false, you
;; can negate the result of what you're doing using `not`, like `(is (not (having-fun)))`.
