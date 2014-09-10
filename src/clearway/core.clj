(ns clearway.core
  (:require clearway.repl)
  (:gen-class))


(defn -main [& args]
  (apply clearway.repl/-main args)
  )
