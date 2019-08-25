;; functions3.clj
;; Make me compile! Scroll down for hints :)

(ns functions.functions3)

(defn -main []
  (call-me 3))

(defn call-me [num]
  (doseq [i (range num)]
    (println "Ring! Call number" (+ i 1))))





































;; The function definition for `call-me` is OK, but the compiler doesn't know about
;; this function at the time of compiling `-main`.
