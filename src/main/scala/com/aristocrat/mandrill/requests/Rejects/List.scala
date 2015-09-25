package com.aristocrat.mandrill.requests.Rejects

import com.fasterxml.jackson.annotation.JsonProperty

case class List(
    key: String,
    email: String,
    includeExpired: Boolean,
    @JsonProperty("subaccount") subAccount: String)
