package com.aristocrat.mandrill.requests.Rejects

import com.fasterxml.jackson.annotation.JsonProperty

case class Add(
    key: String,
    email: String,
    comment: String,
    @JsonProperty("subaccount") subAccount: String)
