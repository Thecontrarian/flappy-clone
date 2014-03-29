(ns flappy-clone.core
  (:require [goog.events :as events]
            [goog.dom :as dom]))

(enable-console-print!)

(println "Hello world!")

(defn surface []
  (let [surface (dom/getElement "surface")]
    [(.getContext surface "2d")
     (. surface -width)
     (. surface -height)]))

