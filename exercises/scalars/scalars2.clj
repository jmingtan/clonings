;; scalars2.clj
;; Fill in the rest of the line that has code missing!
;; No hints, there's no tricks, just get used to typing these :)

(ns scalars.scalars2)

(defn -main []
  ;; Characters
  (let [my-first-initial \C]
    (if (char? my-first-initial)
      (println "Alphabetical!"))
    (if (number? my-first-initial)
      (println "Numerical!"))
    (if (not (or (char? my-first-initial)
                 (number? my-first-initial)))
      (println "Neither alphabetic nor numeric!")))
  
  (let [your-character] ;; Finish this line like the example! What's your favorite character?
    ;; Try a letter, try a number, try a special character, try a character
    ;; from a different language than your own, try an emoji!
    (if (char? your-character)
      (println "Alphabetical!"))
    (if (number? your-character)
      (println "Numerical!"))
    (if (not (or (char? your-character)
                 (number? your-character)))
      (println "Neither alphabetic nor numeric!"))))

;; Note: The following special character literals can be used for
;; common characters: \newline, \space, \tab, \formfeed,
;; \backspace, and \return.
;; https://clojure.org/reference/reader#_character