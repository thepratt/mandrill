package com.aristocrat.mandrill.requests.Inbound

import com.aristocrat.mandrill.requests.MandrillRequest

case class CheckDomain(key: String, domain: String) extends MandrillRequest
