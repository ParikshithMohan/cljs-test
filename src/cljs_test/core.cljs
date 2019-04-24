(ns cljs-test.core
    (:require ))

(enable-console-print!)



;; define your app data so that it doesn't get over-written on reload
(defonce app-state (atom {:text "parikshith"
                          :__figwheel_counter 0}))
(println app-state )


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
   (swap! app-state update-in [:__figwheel_counter] inc)
)
