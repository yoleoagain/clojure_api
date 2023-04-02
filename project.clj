(defproject moment_bonus "0.1"
  :dependencies [[org.clojure/clojure                "1.10.3"]
                 [io.pedestal/pedestal.service       "0.5.10"]
                 [io.pedestal/pedestal.service-tools "0.5.10"]
                 [io.pedestal/pedestal.jetty         "0.5.10"]
                 [io.pedestal/pedestal.immutant      "0.5.10"]
                 [io.pedestal/pedestal.tomcat        "0.5.10"]
                 [io.pedestal/pedestal.aws           "0.5.10"]
                 [io.pedestal/pedestal.log           "0.5.10"]
                 [io.pedestal/pedestal.interceptor   "0.5.10"]
                 [io.pedestal/pedestal.route         "0.5.10"]
                 [org.clojure/java.jdbc              "0.7.12"]
                 [org.postgresql/postgresql          "42.2.5"]]
  :main server)