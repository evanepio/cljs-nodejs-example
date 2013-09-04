(ns nodejstest.core
  (:require [cljs.nodejs :as node]))

(def http
  (node/require "http"))

(defn handler [_ res]
  (.writeHead res 200 {"Content-Type" "text/plain"})
  (.end res "Hello World!\n"))

(defn -main [& _]
  (let [server (.createServer http handler)
        server-url "127.0.0.1"
        server-port 1337]
    (.listen server server-port server-url)
    (println (str "Server running at http://" server-url ":" server-port "/"))))

(set! *main-cli-fn* -main)

