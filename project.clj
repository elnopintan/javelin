(defproject tailrecursion/javelin "1.0.0-SNAPSHOT"
  :description "A Functional Reactive Programming library for ClojureScript"
  :url "https://github.com/tailrecursion/javelin"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[tailrecursion/cljs-priority-map "1.0.0"]
                 [alandipert/desiderata "1.0.1"]]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :source-paths ["src/clj" "src/cljs"]
  :cljsbuild {:builds
              {:test
               {:source-paths ["src/clj" "src/cljs" "test"]
                :compiler {:output-to "test/test.js"
                           :optimizations :advanced
                           :warnings true
                           ;; :optimizations :whitespace
                           ;; :pretty-print true
                           }
                :jar false}}
              :test-commands {"unit" ["phantomjs" "test/runner.js"]}})
