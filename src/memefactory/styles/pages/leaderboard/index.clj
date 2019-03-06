(ns memefactory.styles.pages.leaderboard.index
  (:require [garden.def :refer [defstyles]]
            [garden.stylesheet :refer [at-media]]
            [clojure.string :as s]
            [memefactory.styles.base.icons :refer [icons]]
            [memefactory.styles.base.borders :refer [border-top border-bottom]]
            [memefactory.styles.base.colors :refer [color]]
            [memefactory.styles.base.fonts :refer [font]]
            [memefactory.styles.base.media :refer [for-media-min for-media-max]]
            [memefactory.styles.component.search :refer [search-panel]]
            [memefactory.styles.component.panels :refer [panel-with-icon]]
            [garden.selectors :as sel]
            [garden.units :refer [pt px em rem]]
            [clojure.string :as str]))

(defstyles core
  [:.leaderboard-dankest-page
   [:.spinner-container {:width (px 900)
                         :height (px 500)}
    [:.spinner-outer {:margin-left :auto
                      :margin-right :auto
                      :padding-top (em 12)}]]

   [:section.dankest
    [:.dankest-panel {:min-height (px 550)}
     (panel-with-icon {:url "/assets/icons/trophy2.svg"
                       :color :leaderboard-curator-bg})]
    [:.scroll-area
     {:width "100%"}
     [:.tiles
      {:margin-top (em 2)
       :padding-top (em 2)
       :padding-bottom (em 2)
       :background-color (color :meme-panel-bg)
       :box-shadow :none
       :border-radius "1em 1em 1em 1em"}]]]])
