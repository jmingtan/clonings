;; functions4.clj
;; Make me compile! Scroll down for hints :)

(ns functions.functions4)

(defn -main []
  (let [call-me ([num]
                 (doseq [i (range num)]
                   (println "Ring! Call number" (+ i 1))))]
    (call-me 3)))


































;; On line 7 we are defining an anonymous function to a local
;; binding, but it needs a keyword to compile correctly.

;; Note: There are two different ways to write anonymous functions in Clojure,
;; try them both! https://kimh.github.io/clojure-by-example/#anonymous-function
