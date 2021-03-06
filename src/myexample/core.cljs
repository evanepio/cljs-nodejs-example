(ns express_sample
  (:require [cljs.nodejs :as node]))

(def express (node/require "express"))
(def app (express))

(defn hello-world [req res]
  (.send res "Hello World"))

(defn -main [& args]
  (let [port 3000]
    (doto app
      (.get "/" hello-world)
      (.listen 3000))
    (println (str "Express server started on port: " port))))

(set! *main-cli-fn* -main)
