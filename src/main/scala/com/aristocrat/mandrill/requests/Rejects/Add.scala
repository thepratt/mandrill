package com.aristocrat.mandrill.requests.Rejects

import com.aristocrat.mandrill.requests.MandrillRequest

case class Add(
    key: String,
    email: String,
    comment: String,
    subaccount: String) extends MandrillRequest
