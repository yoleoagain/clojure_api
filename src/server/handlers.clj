(ns server.handlers)

(defn get-hello-response [request]
  {:status 200 :body "Hello, world!"})