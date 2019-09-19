;; require3.clj
;; Make the code compile! No hints, you can do it :)

(ns namespaces.require3)

;; The last feature of `require` we want to explore is `refer`, which "refers"
;; vars from an external namespace directly into the current namespace
(require '[clojure.test :refer [deftest testing is]])
(require '[clojure.string])

(deftest my-test
  (testing "should return the joined strings"
    (is (= (abcdef/join " " ["hey" "nonny" "nonny"])
           "hey nonny nonny"))))
