(ns server.routes
  (:require [io.pedestal.http.route :as route]
            [server.handlers]))

(def routes
  (route/expand-routes
    #{["/:products" :get server.handlers/get-hello-response :route-name :products]}))