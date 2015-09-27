package com.aristocrat.mandrill.requests.Rejects

import com.aristocrat.mandrill.requests.MandrillRequest

case class List(
    key: String,
    email: String,
    includeExpired: Boolean,
    subaccount: String) extends MandrillRequest
