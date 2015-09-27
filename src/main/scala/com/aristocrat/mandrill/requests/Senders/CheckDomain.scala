package com.aristocrat.mandrill.requests.Senders

import com.aristocrat.mandrill.requests.MandrillRequest

case class CheckDomain(key: String, domain: String) extends MandrillRequest
