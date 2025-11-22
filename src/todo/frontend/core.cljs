(ns todo.frontend.core
(:require [reagent.core :as r]
[reagent.dom.client :as rdom]))

(defonce app-state (r/atom 0))

(defn counter-app []
[:div 
[:h1 "Ententendo o 'r/atom'"]
[:p "O valor atual do contador é: " @app-state]
[:button 
{:on-click #(swap! app-state inc)}
"Clique para Incrementar"]
[:button
{:on-click #(reset! app-state 0)}
"Resetar"]])

(defn ^:export init []
(println "Frontend App 'Contador' inicializando...")
(let [root (rdom/create-root (js/document.getElementById "app"))]
(.render root (r/as-element [counter-app]))))