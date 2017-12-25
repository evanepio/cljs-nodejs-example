(defproject node-js-test "0.1.0-SNAPSHOT"
  :description "cljs-nodejs-example: example ClojureScript node.ja app"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]]
  :hooks [leiningen.cljsbuild]
  :plugins [[lein-cljsbuild "1.1.7"]]
  :cljsbuild {
              :builds [{
                        :source-paths ["src/myexample"]
                        :compiler {:output-to "target/js/myexample.js"
                                   :target :nodejs
                                   :optimizations :simple
                                   :pretty-print true }}]})

