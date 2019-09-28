(ns brainrex-api-explorer.api.blockchain
  (:require [brainrex-api-explorer.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn blockchain-average-tx-with-http-info
  "Calculate average transccion fee of a given blockchain
  Calculates the average trasnsaction fee of a given"
  [request ]
  (check-required-params request)
  (call-api "/average_tx_fee" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn blockchain-average-tx
  "Calculate average transccion fee of a given blockchain
  Calculates the average trasnsaction fee of a given"
  [request ]
  (:data (blockchain-average-tx-with-http-info request)))

(defn blockchain-list-with-http-info
  "The blockchains data structure supported by the Brainrex API
  List of supported blockchains networks for analysis. The full history of the networks are available."
  []
  (call-api "/list_blockchain" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn blockchain-list
  "The blockchains data structure supported by the Brainrex API
  List of supported blockchains networks for analysis. The full history of the networks are available."
  []
  (:data (blockchain-list-with-http-info)))

