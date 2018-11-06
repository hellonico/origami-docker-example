(ns indexation.image-processing
  (:gen-class)
  (:require [opencv4.core :refer [imread resize! new-size imwrite]]))

(defn resize-keep-ratio! [mat new-width]
  (let [size (.size mat)
        width (.width size)
        height (.height size)
        ratio (/ width height)
        new-height (/ new-width ratio)]
    (println "Image from" width "x" height "to" new-width "x" new-height)
    (resize! mat (new-size new-width new-height))))
;
(defn -main [& args]
  (time (-> "resources/photo.jpg"
            (imread)
            (resize-keep-ratio! 300)
            (imwrite "resources/output.png"))))