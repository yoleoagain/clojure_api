(ns server.handlers
  (:require [clojure.java.jdbc :as j]
            [server.db :as db]))

(defn get-hello-response [request]
  (println
    (j/query db/pg-db ["SELECT current_database()"]))
  {:status 200 :body "Hello, world!"})