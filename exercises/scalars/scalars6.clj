;; scalars6.clj
;; Make me compile! Scroll down for hints :)

(ns scalars.scalars6
  (:require [clojure.test :refer [deftest testing is]]))

(deftest test-scalars6
  ;; Use regular expressions to solve this problem!
  (let [regex ???
        match-result (re-find regex "abcdefgABCdefg")]
    (is (= "ABC" match-result))))





























;; Find out more about regexes and regex literals in Clojure here:
;; https://clojure.org/reference/other_functions#regex



















;; If you're stuck on getting the correct regex or haven't used them before,
;; try using this pattern:
;;
;;   [A-Z]+
;;
;; Now you just have to figure out how to write it out in Clojure!