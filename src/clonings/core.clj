(ns clonings.core
  (:require [clojure.edn :as edn]
            [clojure.test :refer [test-ns]]
            [juxt.dirwatch :refer [watch-dir close-watcher]]))

(def info-file "info.edn")

(defn load-edn [file-name]
  (edn/read-string (slurp file-name)))

(defn clear-screen []
  (doseq [_ (range 80)]
    (println)))

(defn eval-exercise [exercise]
  (let [{:keys [path mode]} exercise]
    (println "compiling" path)
    (let [e (load-file path)
          e-ns (-> e symbol namespace symbol)]
      (condp = mode
        :compile nil
        :run     (e)
        :test    (test-ns e-ns))
      ;; cleanup the namespace for future runs
      (remove-ns e-ns))
    nil))

(defn eval-all-exercises [exercises]
  (try
    (clear-screen)
    (doseq [exercise exercises]
      (eval-exercise exercise))
    (println "done all exercises - congratulations!")
    (catch Exception ex
      (.printStackTrace ex))))

(defn watch [exercises]
  (eval-all-exercises exercises)
  (watch-dir (fn [event]
               (println event)
               (eval-all-exercises exercises))
             (clojure.java.io/file "exercises"))
  (read-line))

(defn -main [& args]
  (let [task (first args)
        info (load-edn info-file)]
    (condp = task
      "verify" (eval-all-exercises (:exercises info))
      "watch"  (watch (:exercises info))
      "run"    (eval-exercise {:path (last args)
                               :mode :run})
      "test"   (eval-exercise {:path (last args)
                               :mode :test}))))
