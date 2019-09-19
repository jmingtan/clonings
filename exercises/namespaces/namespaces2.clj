;; namespaces2.clj
;; Make the code compile! Scroll down for hints :)

;; Clojure has several core functions which let us explore the bindings within
;; a namespace. In this exercise, we take a look at the `ns-interns` function.

(ns namespaces.namespaces2
  (:require [clojure.test :refer [deftest is]]))

(def example-binding1 "abc")

(def example-binding2 "abcd")

(deftest test-ns
  (is (= (ns-interns 'namespaces.namespaces2)
         {'test-ns (var test-ns)
          'example-binding1 (var example-binding1)
          ;; Fill in the following line!
          ???
          })))
























;; The `ns-interns` function returns the current bindings within a namespace.
;; Each key/value pair is a mapping of a name (represented by a Symbol) to an
;; object (represented by a Var). You can do some cool stuff with this! For
;; example, the clojure.test framework uses `ns-interns` to discover and run
;; your tests!















;; Are there any bindings missing from our expected bindings map?
