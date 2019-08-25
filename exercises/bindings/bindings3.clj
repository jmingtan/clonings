;; bindings3.clj
;; Make me run! Scroll down for hints :)

(ns bindings.bindings3)

(def x 5)

(defn -main []
  (binding [x 7]
    (println "x has the value" x)))






























;; Here, we're trying to bind x to a different value. Bindings created using (def)
;; are immutable by default, but there is a way to mark them as dynamic.
;; https://clojure.org/reference/vars