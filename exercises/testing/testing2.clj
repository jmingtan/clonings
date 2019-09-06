;; testing2.rs
;; This test has a problem with it -- make the test compile! Make the test
;; pass! Make the test fail! Scroll down for hints :)

(ns testing.testing2
  (:require [clojure.test :refer [deftest is]]))

(deftest you-can-assert-eq
  (is (=)))



































;; Like the previous exercise, you don't need to write any code to get this
;; test to compile and run. A common pattern in clojure tests is to combine the
;; `is` macro with the `=` function, which compares values and checks their
;; equality.  Try giving it two values that are equal! Try giving it two
;; arguments that are different! Try giving it two values that are of different
;; types! Try switching which argument comes first and which comes second!
