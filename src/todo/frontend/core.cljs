(ns todo.frontend.core
(:require [reagent.core :as r]
[reagent.dom.client :as rdom]))

(defn hello-world []
[:div 
[:h1 "Olá, Alunos!"]
[:p "Nossa aplicação ClojureScript está funcionando."]])

(defn ^:export init []
(println "Frontend App (Mini-App Local) inicializando...")
(let [root (rdom/create-root (js/document.getElementById "app"))]
(.render root (r/as-element [hello-world]))))