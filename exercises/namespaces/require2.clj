;; require2.clj
;; Make the code compile! No hints, you can do it :)

(ns namespaces.require2)

;; Another feature of `require` is aliasing, so we don't have to type the
;; fully-qualified name of the library every time
(require '[clojure.test :as t])

(t/deftest example-test
  (t/is (= (+ 1 1) 2)))

;; Fix the following code!

(require '[clojure.test :as t])
(require '[clojure.string :as ???])

(deftest my-test
  (testing "should return the joined strings"
    (is (= (abcdef/join " " ["hey" "nonny" "nonny"])
           "hey nonny nonny"))))
