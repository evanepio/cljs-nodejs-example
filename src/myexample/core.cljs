(ns express_sample
  (:require [cljs.nodejs :as node]))

(def express (node/require "express"))
(def app (. express (createServer)))

(defn -main [& args]
  (let [port 3000]
    (doto app
      (.use (. express (logger)))
      (.get "/" (fn [req res]
                  (.send res "Hello World")))
      (.listen 3000))
    (println (str "Express server started on port: " port))))

(set! *main-cli-fn* -main)
