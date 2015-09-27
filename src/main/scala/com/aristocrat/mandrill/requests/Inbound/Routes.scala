package com.aristocrat.mandrill.requests.Inbound

import com.aristocrat.mandrill.requests.MandrillRequest

case class Routes(key: String, domain: String) extends MandrillRequest
