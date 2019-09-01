;; vectors1.clj
;; Make me compile by filling in the ??? parts, scroll down for hints :)

(ns collections.vectors1)

;; Vectors are ordered collections of items, created with the [] literal
(def a-vector [1 2 3 4 5])

;; Here are two possible ways to get an indexed element out of a vector:
;; First method:
(nth a-vector 1) ;; returns 2
;; Second method:
(a-vector 1)     ;; returns 2
;; The second method works because the vector type also acts as a function,
;; which behaves as if calling the `nth` function on it.

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
