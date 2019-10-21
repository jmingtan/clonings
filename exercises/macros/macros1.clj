;; macros1.clj
;; Make the code compile and the tests pass! Scroll down for hints :)

(ns macros.macros1
  (:require [clojure.test :refer [deftest testing is]]))

;; Regular function that adds two numbers
(defn add [a b]
  (+ a b))

;; Define a macro that adds two numbers 
(defmacro add-macro [a b]
  (list ? a b))

(deftest my-tests
  (testing "add"
    (testing "should return the result of adding two numbers"
      (is (= (add 2 5) 7))
      (is (= (add 2 (add 5 4)) 11))))
  (testing "add-macro"
    (testing "should return the result of adding two numbers"
      (is (= (add-macro 2 5) 7))
      (is (= (add-macro 2 (add-macro 5 4)) 11)))))































;; On line 13, we see that the macro is trying to return regular Clojure code for execution. Since Clojure
;; code comes in the form of lists, we can just use ordinary functions such as `list` to construct code!
;; Can we return code from this macro that matches the function we've written on lines 8 and 9?