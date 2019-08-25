;; test1.clj
;; This is a test for the following sections:
;; - bindings
;; - control_flow
;; - functions

;; Mary is buying apples. One apple usually costs 2 dollars, but if you buy
;; more than 40 at once, each apple only costs 1! Write a function that calculates
;; the price of an order of apples given the order amount. No hints this time!

(ns test1)

;; Put your function here!
;; (defn calculate-price ...

;; Don't modify this function!
(require '[clojure.test :refer [deftest testing is]])
(deftest verify-test
  (let [price1 (calculate-price 55)
        price2 (calculate-price 40)]
    (= 55 price1)
    (= 80 price2)))
