package com.aristocrat.mandrill.requests.Rejects

import com.fasterxml.jackson.annotation.JsonProperty

case class Delete(
    key: String,
    email: String,
    @JsonProperty("subaccount") subAccount: String)
