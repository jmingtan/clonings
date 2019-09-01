;; collections3.clj
;; Make me compile by completing each function! Scroll down for hints :)

(ns collections.collections3)

(defn find-first
  "Returns the first element in the given collection"
  [coll]
  ;; write your function code here
  )

(defn find-last
  "Returns the last element in the given collection"
  [coll]
  ;; write your function code here
  )

(defn find-third
  "Returns the third element in the given collection"
  [coll]
  ;; write your function code here
  )


















;; Hint: in this exercise you will get to see how to write functions that
;; operate the same way, even when passed different types of collections.
;; Since we are trying to get a specific index out of a collection, we can
;; look for functions that work with the "seq" abstraction.
;; Check out this cheatsheet, under the "Sequences" section!
;; https://clojure.org/api/cheatsheet





















;; Hint: the third function, `find-third`, is a little tricky to write. This is
;; because in our tests we are passing in a list, a vector, and a map. If we
;; just wanted to get the third element from a list and a vector, we could
;; use the `nth` function, but it doesn't have support for maps. Instead, we
;; may have to combine several function calls to get what we need.
;;
;; There are several ways to solve this, scroll down to see some possible answers
;; if you get stuck or want to compare your solution!

























;; Solution 1
;; ----------
;; (defn find-third [coll]
;;   (first (next (next coll))))
;;
;; Solution 2
;; ----------
;; (defn find-third [coll]
;;   (first (nthnext coll 2)))
;;
;; Solution 3
;; ----------
;; (defn find-third [coll]
;;   (nth (seq coll) 2))





;; ignore this section for now!
(require '[clojure.test :refer [deftest testing is]])

(deftest test-find-first
  (testing "finds the first in a list"
    (is (= 3 (find-first '(3 2 1)))))
  (testing "finds the first in a vector"
    (is (= 3 (find-first [3 2 1]))))
  (testing "finds the first in a map"
    (is (= [:a 1] (find-first {:a 1 :b 2 :c 3})))))

(deftest test-find-last
  (testing "finds the last in a list"
    (is (= 1 (find-last '(3 2 1)))))
  (testing "finds the last in a vector"
    (is (= 1 (find-last [3 2 1]))))
  (testing "finds the last in a map"
    (is (= [:c 3] (find-last {:a 1 :b 2 :c 3})))))

(deftest test-find-third
  (testing "finds the third in a list"
    (is (= 1 (find-third '(3 2 1 0)))))
  (testing "finds the third in a vector"
    (is (= 1 (find-third [3 2 1 0]))))
  (testing "finds the third in a map"
    (is (= [:c 3] (find-third {:a 1 :b 2 :c 3 :d 4})))))
