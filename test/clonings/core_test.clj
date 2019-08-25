(ns clonings.core-test
  (:require [clojure.test :refer :all]
            [clonings.core :refer :all]))

(deftest test-load-edn
  (testing "load a edn file"
    (is (= {:a 1} (load-edn "test/clonings/test.edn")))))

(deftest test-eval-exercise
  (testing "evaluates a compile-only exercise"
    (is (nil? (eval-exercise {:path "test/clonings/exercise" :mode :compile}))))
  (testing "evaluates a running exercise"
    (is (nil? (eval-exercise {:path "test/clonings/exercise" :mode :run})))))