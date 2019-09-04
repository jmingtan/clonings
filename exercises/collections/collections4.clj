;; collections4.clj
;; Make me compile by filling in the parts with ???, scroll down for hints :)

(ns collections.collections4)

;; using the contains? function, you can test if a set contains a value:
(contains? #{:a :b :c :d :e} :b) ;; returns true

;; try using contains? to check if a map has :a
(let [my-map #{???}]
  (if (contains? my-map :a)
    (println "Yup, your map does contain :a!")
    (throw (AssertionError. "map should contain :a!"))))
;; you may have noticed here that when given a map, `contains?` is actually
;; checking whether the map contains a particular key, since that is most
;; likely the behaviour you are looking for.


;; Having said that, we will see here that `contains?` works a little
;; non-intuitively with lists and vectors:
(def a-vector [:a :b :c :d :e])
(contains? a-vector :b)  ;; returns false
(contains? a-vector 2)   ;; returns true

;; What's going on here? Some core functions in clojure have guarantees about
;; their time complexity, a measure which allows you to determine how well a
;; function, performs especially when given very large inputs.
;; https://en.wikipedia.org/wiki/Time_complexity
;;
;; In this case, `contains?` has a guarantee of either constant or log time,
;; but there isn't any way to achieve that when searching a list. Rather than
;; just throwing an "Unsupported" exception, `contains?` instead chooses to
;; check whether a given index exists within the collection, so in the above
;; example the index "2" (which references the :c value) does exist.

;; Your job now is to write a function that checks for a value within a list!
(defn list-contains?
  "Returns true if list contains the given value"
  [coll v]
  ???
  )

(defn -main []
  (if (list-contains? a-vector :b)
    (println "Success, :b was found!")
    (do
      (println "Couldn't find :b in the list, try again!")
      (throw (AssertionError. "list should contain :b")))))








































;; Hint: one way to implement `list-contains?` is with using the `some` function combined
;; with a predicate function
