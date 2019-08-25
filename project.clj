(defproject clonings "1.0.0"
  :description "A project for learning Clojure, based on rustlings"
  :url "https://github.com/jmingtan/clonings"
  :license {:name "MIT"
            :url "https://mit-license.org/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [juxt/dirwatch "0.2.5"]]
  :aliases {"clonings" ["run" "-m" "clonings.core"]}
  :repl-options {:init-ns clonings.core})
