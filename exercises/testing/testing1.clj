;; testing1.clj
;; Tests are important to ensure that your code does what you think it should do.
;; Tests can be run on this file with the following command:
;; lein clonings test exercises/testing/testing1.clj

(ns testing.testing1
  (:require [clojure.test :refer [deftest is]]))

;; This test has a problem with it -- make the test compile! Make the test
;; pass! Make the test fail! Scroll down for hints :)

(deftest you-can-assert
  (is))






























;; You don't even need to write any code to test -- you can just test values and run that, even
;; though you wouldn't do that in real life :) `is` is a macro that needs an argument.
;; Depending on the value of the argument, `is` will return true (in which case the test will
;; pass) or `is` will return false (in which case the test will fail). So try giving different values
;; to `is` and see which ones compile, which ones pass, and which ones fail :)
