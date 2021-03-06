(ns memefactory.styles.pages.my-settings
  (:require [garden.def :refer [defstyles]]
            [memefactory.styles.base.media :refer [for-media-min for-media-max]]
            [garden.units :refer [pt px em rem]]
            [memefactory.styles.base.colors :as c]
            [memefactory.styles.base.fonts :refer [font]]
            [memefactory.styles.component.buttons :refer [button get-dank-button]]
            [memefactory.styles.component.panels :refer [panel-with-icon]]))

(defstyles core
  [:.my-settings-page
   (for-media-max :tablet
                   [:&
                    {:margin-right (em 2)
                     :margin-left (em 2)}])
   [:.my-settings-box
     (panel-with-icon {:url "/assets/icons/mysettings.svg"
                       :color :sky-blue})
    [:.icon {:background-size [(em 2) (em 2)]}]
    [:.form {:font-size (px 14)
             :margin (em 2)}
     [:.alert {:color :green
               :margin-bottom (em 1)}]
     (for-media-min :large [:.labeled-input-group {:width "30%"}])]
    [:.footer
      (get-dank-button)]]])
