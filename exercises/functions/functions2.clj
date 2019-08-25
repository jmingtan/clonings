;; functions2.clj
;; Make me compile! Scroll down for hints :)

(ns functions.functions2)

(defn call-me []
  (doseq [i (range num)]
    (println "Ring! Call number" (+ i 1))))

(defn -main []
  (call-me 3))


































;; The function declaration on line 6 is missing an argument
