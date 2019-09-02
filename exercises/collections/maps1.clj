;; maps1.clj
;; Make me compile by filling in the ??? parts, scroll down for hints :)

(ns collections.maps1)

;; maps are associative collections of key-value pairs, created with the {} literal
(def a-map #{:a 1
             :b 2
             :c 3
             :d 4
             :e 5})

;; Here are two possible ways to retrieve an element from a map:
;; First method:
(get a-map :b) ;; returns 2
;; Second method:
(:b a-map)     ;; returns 2
;; The second method works because keyword types also act as a function,
;; which behaves as if calling the `get` function on it.
;; https://clojure.org/reference/data_structures#Keywords

;; try creating your own map here!
(def my-map ???)

(defn -main []
  (if (map? my-map)
    (println "I'm going to be reading your map now...")
    (do
      (println "Hey! It doesn't look like you've given me a valid map!")
      (throw (IllegalArgumentException. "Make me a map!"))))
  (println "There are" (count my-map) "elements in your map!")
  (if (not-empty my-map)
    (let [random-key (rand-nth (keys my-map))]
      (println (format "A random pair from your map is... %s => %s!" random-key (get random-key my-map))))
    (do
      (println "It looks like your map is empty, why don't you try putting in some items?")
      (throw (IllegalArgumentException. "Give me some items, please :)")))))
