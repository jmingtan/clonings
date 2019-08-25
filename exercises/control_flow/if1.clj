;; if1.clj

(ns control-flow.if1)

(defn bigger [a b]
  ;; Complete this function using `if` to return the bigger number!
  ;; Do not use additional bindings
  )




;; Don't mind this for now :)
(require '[clojure.test :refer [deftest testing is]])

(deftest test-bigger
  (testing "10 is bigger than 8"
    (is (= 10 (bigger 10 8))))
  (testing "42 is bigger than 32"
    (is (= 42 (bigger 32 42)))))





























;; `if` can be tricky due to it's extremely concise syntax. Here is the definition of `if`:
;;
;;   (if <test> <then> <else?>)
;;
;; `then` and `else` are *not* keywords, they are simply expressions that will be evaluated
;; depending whether `test` evaluates to true or false. If true, `if` will evaluate the `then`
;; expression and return the result.









;; Hint: `if` is an expression, so it evaluates to a value, which you can return from the function













;; Hint: functions return the last expression - there's no explicit return statement in Clojure