(ns memefactory.styles.pages.terms
  (:require [garden.def :refer [defstyles]]
            [garden.stylesheet :refer [at-media]]
            [clojure.string :as s]
            [memefactory.styles.base.icons :refer [icons]]
            [memefactory.styles.base.borders :refer [border-top]]
            [memefactory.styles.base.colors :refer [color]]
            [memefactory.styles.base.fonts :refer [font]]
            [memefactory.styles.base.media :refer [for-media-min for-media-max]]
            [garden.selectors :as sel]
            [garden.units :refer [pt px em rem]]
            [memefactory.styles.component.panels :refer [panel-with-icon]]))

(defstyles core
  [:.terms-page
   [:.panel {:margin-bottom (em 2)}]
   [:.body {:font-size (px 15)
            :padding (em 2)}]
   [:.terms
    (panel-with-icon {:url "/assets/icons/terms-of-use2.svg"
                      :color "#c3e4f3"})
    [:&
     [:h2.title
      {:color "#fa9456"}]]]])
