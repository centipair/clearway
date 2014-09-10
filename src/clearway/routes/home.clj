(ns clearway.routes.home
  (:require [compojure.core :refer :all]
            [clearway.layout :as layout]
            [clearway.util :as util]))

(defn home-page []
  (layout/render
    "home.html" ))

(defn about-page []
  (layout/render "about.html"))

(defn services-page []
  (layout/render "services.html"))

(defn contact-page []
  (layout/render "contact.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/services" [] (services-page))
  (GET "/contact" [] (contact-page)))
