package com.aristocrat.mandrill.requests.Inbound

import com.aristocrat.mandrill.requests.MandrillRequest

case class UpdateRoute(
    key: String,
    id: String,
    pattern: String,
    url: String) extends MandrillRequest
