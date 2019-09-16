;; require1.clj
;; Make the code compile! No hints, you can do it :)

(ns namespaces.require1)

;; In Clojure we can load libraries using the `require` function, which then
;; looks for a Clojure namespace with that same name and loads it.
;; https://clojure.github.io/clojure/clojure.core-api.html#clojure.core/require
(require '[clojure.test])


;; Once a library is loaded, we can reference that library from anywhere in our
;; code (even in other clojure files) by using the fully-qualified name of the
;; library (it's safer to always explicitly require any libraries you depend on
;; within the same file though).
(clojure.test/deftest example-test
  (clojure.test/is (= (+ 1 1) 2)))

;; Can you fix this test so that it compiles?
(deftest my-test
  (testing "should return the result of 2 times 5"
    (is (= (* 2 5) 10))))
