(defproject flappy-clone "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]
                 [rm-hull/monet "0.1.10"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "flappy-clone"
              :source-paths ["src"]
              :compiler {
                :output-to "flappy_clone.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
