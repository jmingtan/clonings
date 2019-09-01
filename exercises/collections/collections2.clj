;; collections2.clj
;; Make me compile by filling in the parts with ???, scroll down for hints :)

(ns collections.collections2)

(defn add-50
  "Returns a copy of the collection with the value 50 added!"
  [coll]
  (let [new-value 50]
    ;; fill in your code here, using the `conj` function
    ???
    ))

(def a-list '(3 2 1))

(def a-vector [3 2 1])

(defn -main []
  (let [;; Can you guess what the first element of my-list will be?
        my-list       (add-50 a-list)
        my-list-guess (= (first my-list)
                         ??? ;; replace this with your guess
                         )
        ;; Can you guess what the first element of my-vector will be?
        my-vector     (add-50 a-vector)
        my-vec-guess  (= (first my-vector)
                         ??? ;; replace this with your guess
                         )]
    (if my-list-guess
      (println "your guess for the first element of the list was correct! :)")
      (println "your guess for the first element of the list was not correct!"))
    (if my-vec-guess
      (println "your guess for the first element of the vector was correct! :)")
      (println "your guess for the first element of the vector was not correct!"))))



























;; Hint: lists and vectors are both ordered collections of items. This array of numbers:
;;
;;   1 2 3 4 5
;;
;; could be stored equally well in either a list or a vector. The `conj` function has
;; the following documentation:
;;
;; clojure.core/conj
;; ([coll x] [coll x & xs])
;;   conj[oin]. Returns a new collection with the xs
;;     'added'. (conj nil item) returns (item).  The 'addition' may
;;     happen at different 'places' depending on the concrete type.
;;
;; So, the place where `conj` adds the new element actually differs based on whether
;; you pass in a vector or a list. To summarize the difference:
;;
;; vector - a collection backed by a contiguous array
;; list   - a collection backed by single linked-list




















;; Hint: Here's a stackoverflow thread with more discussion about vectors and lists
;; https://stackoverflow.com/questions/17910673/difference-in-behavior-of-conj-on-vectors-and-lists-in-clojure















;; ignore this section for now!
(require '[clojure.test :refer [deftest is]])

(deftest test-add-50
  (let [result (add-50 '(3 2 1))]
    (is (= 50 (first result)))
    (is (= 4 (count result))))
  (let [result (add-50 [3 2 1])]
    (is (= 3 (first result)))
    (is (= 4 (count result)))))
