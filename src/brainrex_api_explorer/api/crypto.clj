(ns brainrex-api-explorer.api.crypto
  (:require [brainrex-api-explorer.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn exchanges-download-candles-with-http-info
  "Downloads candle format market data
  Returns a list of candle data from specified market and data range"
  [request ]
  (check-required-params request)
  (call-api "/download_candles" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn exchanges-download-candles
  "Downloads candle format market data
  Returns a list of candle data from specified market and data range"
  [request ]
  (:data (exchanges-download-candles-with-http-info request)))

(defn exchanges-list-with-http-info
  "The markets data structure supported by the Brainrex Market API
  Read the list of supported markets ( currency pairs ) in each exchange"
  []
  (call-api "/markets" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn exchanges-list
  "The markets data structure supported by the Brainrex Market API
  Read the list of supported markets ( currency pairs ) in each exchange"
  []
  (:data (exchanges-list-with-http-info)))

(defn exchanges-marketmaker-with-http-info
  "Market Making as a Service API.
  Our AI will trade at the risk level you want, you need to provide your credential to the exchange you are trading at."
  [request ]
  (check-required-params request)
  (call-api "/market_making" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn exchanges-marketmaker
  "Market Making as a Service API.
  Our AI will trade at the risk level you want, you need to provide your credential to the exchange you are trading at."
  [request ]
  (:data (exchanges-marketmaker-with-http-info request)))

(defn exchanges-read-with-http-info
  "The exchanges data structure supported by the Brainrex API
  Read the list of supported exchanges in the Market Data API"
  []
  (call-api "/exchanges" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn exchanges-read
  "The exchanges data structure supported by the Brainrex API
  Read the list of supported exchanges in the Market Data API"
  []
  (:data (exchanges-read-with-http-info)))

(defn exchanges-ticker-data-download-with-http-info
  "Download raw ticker data from major crypto markets
  Downloads specified asset class and market and time frame. Of our raw ticker data format"
  [request ]
  (check-required-params request)
  (call-api "/download_ticker" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn exchanges-ticker-data-download
  "Download raw ticker data from major crypto markets
  Downloads specified asset class and market and time frame. Of our raw ticker data format"
  [request ]
  (:data (exchanges-ticker-data-download-with-http-info request)))

