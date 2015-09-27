package com.aristocrat.mandrill.requests.Rejects

import com.aristocrat.mandrill.requests.MandrillRequest

case class Delete(
    key: String,
    email: String,
    subaccount: String) extends MandrillRequest
