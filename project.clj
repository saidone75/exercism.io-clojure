(defproject exercism.io "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-RC1"]
                 [jonase/eastwood "0.2.4" :exclusions  [org.clojure/clojure]]]

  :plugins  [[lein-cljsbuild "1.1.3"]
             [lein-environ "1.0.3"]
             [lein-cljfmt "0.5.3"]
             [jonase/eastwood "0.2.4"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
