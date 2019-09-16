;; symbols1.clj
;; Make me compile! Scroll down for hints :)

(ns reader.symbols1
  (:require [clojure.test :refer [deftest testing is]]))

(defn -main []
  ;; replace the ??? to fix the following line!
  (if (symbol? (??? my-symbol))
    (println "I've received a symbol!")
    (throw (IllegalArgumentException. "Make me a symbol!")))

  ;; fix the following line without removing any characters!
  (if (symbol? ')
    (println "Received another symbol, thank you!")
    (throw (IllegalArgumentException. "Make me a symbol!"))))



























;; If you try to replace ??? with any "ordinary" function, you'll find the code
;; still fails because Clojure is trying to evaluate `my-symbol`, but there is
;; no binding for this name. Can you find a function that prevents evaluation
;; of `my-symbol`?


















;; The error on line 14 is meant to show you a syntax shortcut that the Clojure
;; reader supports. Try looking up what the ' character does in the
;; [reader](https://clojure.org/reference/reader) documentation!
