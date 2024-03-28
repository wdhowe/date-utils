(defproject com.github.wdhowe/date-utils "0.2.0"

  ;;; Project Metadata
  :description "A Clojure library for getting date based information."
  :url "https://github.com/wdhowe/date-utils"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  ;;; Dependencies, Plugins
  :dependencies [[org.clojure/clojure "1.11.2"]
                 [clojure.java-time/clojure.java-time "1.4.2"]]

  ;;; Profiles
  :profiles {:uberjar {:aot :all}}

  ;;; Running Project Code
  :repl-options {:init-ns date-utils.core})
