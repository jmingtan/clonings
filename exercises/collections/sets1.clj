;; sets1.clj
;; Make me compile by filling in the ??? parts, scroll down for hints :)

(ns collections.sets1)

;; sets are unordered collections of unique items, created with the #{} literal
(def a-set #{1 2 3 4 5})

;; try creating your own set here!
(def my-set ???)

(defn convert-to-set
  [coll]
  ;; try converting `coll` to a set here
  ???
  )

(defn -main []
  (if (set? my-set)
    (println "I'm going to be reading your set now...")
    (do
      (println "Hey! It doesn't look like you've given me a valid set!")
      (throw (IllegalArgumentException. "Make me a set!"))))
  (println "There are" (count my-set) "elements in your set~!")

  (let [input [1 1 2 2 3 3 4 4 5 5]
        result (convert-to-set input)]
    (if (= #{5 4 3 2 1} result)
      (println "Your convert-to-set function works perfectly!")
      (do
        (println "I didn't get a correct result for convert-to-set, please try again!")
        (throw (AssertionError. "incorrect convert-to-set implementation")))))


















  ;; Hint: to implement `convert-to-set`, you can use one of the functions in the
  ;; "Collections" section, under "Generic ops":
  ;; https://clojure.org/api/cheatsheet
