package com.aristocrat.mandrill.requests.Inbound

import com.aristocrat.mandrill.requests.MandrillRequest

case class AddDomain(key: String, domain: String) extends MandrillRequest
