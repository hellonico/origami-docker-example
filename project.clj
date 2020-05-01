(defproject indexation "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["vendredi" "https://repository.hellonico.info/repository/hellonico/"]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [origami "4.3.0-6" :exclusions [[opencv/opencv-native]]]
                 [opencv/opencv-native "4.3.0-1" :classifier "linux_64"]]
  :main indexation.image-processing)
