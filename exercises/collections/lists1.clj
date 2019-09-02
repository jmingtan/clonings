;; lists1.clj
;; Make me compile by filling in the ??? parts, no hints here!

(ns collections.lists1)

;; lists are ordered collections of items, created with the '() literal
(def a-list '(1 2 3 4 5))

;; try creating your own list here!
(def my-list ???)

(defn -main []
  (if (list? my-list)
    (println "I'm going to be reading your list now...")
    (do
      (println "Hey! It doesn't look like you've given me a valid list!")
      (throw (IllegalArgumentException. "Make me a list!"))))
  (println "There are" (count my-list) "elements in your list~!")
  (if (not-empty my-list)
    (println (format "The first element in the list is... %s!" (first my-list)))
    (do
      (println "It looks like your list is empty, why don't you try putting in some items?")
      (throw (IllegalArgumentException. "Give me some items, please :)")))))
