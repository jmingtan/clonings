;; scalars1.clj
;; Fill in the rest of the line that has code missing!
;; No hints, there's no tricks, just get used to typing these :)

(ns scalars.scalars1)

(defn -main []
  ;; Booleans
  (let [is-morning? true]
    (if is-morning?
      (println "Good morning!")))
  (let [is-evening?] ;; Finish the rest of this line like the example! Or make it be false!
    (if is-evening?
      (println "Good evening!"))))

;; Note: Besides booleans, there are a number of values which are treated as
;; true or false in Clojure, and we call such values "truthy" or "falsey". Try
;; them out in this program!
;;
;; Excerpt from "Clojure for the Brave and True"
;; ---------------------------------------------
;; Both nil and false are used to represent logical falsiness, whereas
;; all other values are logically truthy. Truthy and falsey refer to
;; how a value is treated in a Boolean expression, like the first
;; expression passed to if.
;;
;; https://www.braveclojure.com/do-things/