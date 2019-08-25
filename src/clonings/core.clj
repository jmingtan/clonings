(ns clonings.core
  (:require [clojure.edn :as edn]))

(def info-file "info.edn")

(defn load-edn [file-name]
  (edn/read-string (slurp file-name)))

(defn eval-exercise [exercise]
  (let [{:keys [path mode]} exercise]
    (println "compiling" path)
    (let [sym (load-file path)]
      (if (= mode :run)
        (sym)))
    nil))

(defn eval-all-exercises [exercises]
  (doseq [exercise exercises]
    (eval-exercise exercise)))

(defn -main [task]
  (let [info (load-edn info-file)]
    (condp = task
      "verify" (eval-all-exercises (:exercises info)))))