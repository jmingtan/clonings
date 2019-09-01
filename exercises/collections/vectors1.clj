;; vectors1.clj
;; Make me compile by filling in the ??? parts, scroll down for hints :)

(ns collections.vectors1)

;; vectors are ordered collections of items, created with the [] literal
(def a-vector [1 2 3 4 5])

;; try creating your own vector here!
(def my-vector ???)

(defn -main []
  (if (vector? my-list)
    (println "I'm going to be reading your vector now...")
    (do
      (println "Hey! It doesn't look like you've given me a valid vector!")
      (throw (IllegalArgumentException. "Make me a vector!"))))
  
  (println "There are" (count my-vector) "elements in your vector~!")
  (if (not-empty my-vector)
    (println (format "The first element in the vector is... %s!" (first my-vector)))
    (do
      (println "It looks like your vector is empty, why don't you try putting in some items?")
      (throw (IllegalArgumentException. "Give me some items, please :)")))))
