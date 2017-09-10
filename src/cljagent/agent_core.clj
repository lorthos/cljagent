(ns cljagent.agent-core
  (:gen-class :name cljagent.Agent
              :main false
              :methods [^:static [premain [String java.lang.instrument.Instrumentation] void]]))

(defn -premain
  [agent-args instrumentation]
  (println "Hello, World from agent!")
  )
