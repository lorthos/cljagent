(defproject cljagent "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha20"]]
  :aot [cljagent.agent-core cljagent.core]
  :main cljagent.core
  :jvm-opts ["-javaagent:target/cljagent-0.1.0-SNAPSHOT.jar"]
  :manifest {"Premain-Class" "cljagent.Agent"}
  )
