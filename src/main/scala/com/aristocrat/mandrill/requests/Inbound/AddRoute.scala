package com.aristocrat.mandrill.requests.Inbound

import com.aristocrat.mandrill.requests.MandrillRequest

case class AddRoute(
    key: String,
    domain: String,
    pattern: String,
    url: String) extends MandrillRequest
