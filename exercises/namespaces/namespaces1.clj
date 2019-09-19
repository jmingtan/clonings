;; namespaces1.clj
;; Make the code compile! Scroll down for hints :)


;; By now, you will have seen calls to `ns` throughout all the
;; exercises near the top of each file. `ns` is a macro that sets the current
;; namespace and tells Clojure that any further bindings created  will live
;; under the given name, in this case "namespaces.namespaces1".

(ns namespaces.namespaces1
  (:require [clojure.test :refer [deftest is]]))

(defn string-lowercase+trim [s]
  (trim (lower-case s)))

(deftest test-namespaces1
  (is (= (string-lowercase+trim "  MiXeD CaSiNG    ")
         "mixed casing")))





























;; On line 11, we can see that the `ns` macro supports the `require` directive
;; which wraps over the `require` function we have explored in previous
;; exercises. In this case, line 11 is loading the clojure.test library, then
;; "refers" the `deftest`, `testing`, and `is` vars directly into the current
;; namespace.


















;; Our code is also depending on `lower-case` and `trim`, which
;; exist in the clojure.string library. Can we refer those vars from
;; clojure.string as well?
