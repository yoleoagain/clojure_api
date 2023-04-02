(ns server
      (:require [io.pedestal.http :as http]
                [server.routes :as routes]))

(defn create-server []
      (http/create-server
            {::http/routes routes/routes
             ::http/type   :jetty
             ::http/port   8890}))

(defn start []
      (http/start (create-server)))