;; strings1.clj
;; Make the tests pass! Scroll down for hints :)

(ns strings.strings1
  (:require [clojure.test :refer [deftest is]]
            [clojure.string :as string]))

(deftest return-the-fourth-character
  (let [input     "abcdefg"
        ;; using the value of `input`, find the 4th character!
        my-answer ???]
    (is (= \d my-answer))))

(deftest return-the-length
  (let [input     "abcdefg"
        ;; using the value of `input`, find out how many characters there are!
        my-answer ???]
    (is (= 7 my-answer))))

(deftest chop-the-head
  (let [input     "abcdefg"
        ;; using the value of `input`, remove the first character!
        my-answer ???]
    (is (= "bcdefg" my-answer))))




































;; Strings in Clojure can be treated as sequences of characters, so check out the functions
;; under "Collections" in the Clojure cheatsheet (https://clojure.org/api/cheatsheet) to
;; see if they help!



















;; On the `chop-the-head` test, you may need to combine two different library functions,
;; including one from the clojure.string (https://clojure.github.io/clojure/clojure.string-api.html)
;; library. The clojure.string library has already been imported for you, so you can access
;; its functions like so: `(string/starts-with? "abc" "a")`
