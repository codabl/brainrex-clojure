(ns brainrex-api-explorer.api.sentiment-analysis
  (:require [brainrex-api-explorer.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn sentiment-get-price-sentiment-with-http-info
  "Sentiment analysis score using a model trained for buy signals.
  Gives a 0 to 1 score, depending on buy/sell sentiment"
  [text ]
  (check-required-params text)
  (call-api "/get_buy_sentiment" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    text
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn sentiment-get-price-sentiment
  "Sentiment analysis score using a model trained for buy signals.
  Gives a 0 to 1 score, depending on buy/sell sentiment"
  [text ]
  (:data (sentiment-get-price-sentiment-with-http-info text)))

(defn sentiment-get-sentiment-with-http-info
  "Sentiment analysis for any given blob of text
  Gives a -1 to 1 score, depending on bearish/bullish sentiment"
  [text ]
  (check-required-params text)
  (call-api "/get_sentiment" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    text
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn sentiment-get-sentiment
  "Sentiment analysis for any given blob of text
  Gives a -1 to 1 score, depending on bearish/bullish sentiment"
  [text ]
  (:data (sentiment-get-sentiment-with-http-info text)))

