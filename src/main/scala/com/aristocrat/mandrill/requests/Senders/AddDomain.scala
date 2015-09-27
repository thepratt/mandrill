package com.aristocrat.mandrill.requests.Senders

import com.aristocrat.mandrill.requests.MandrillRequest

case class AddDomain(key: String, domain: String) extends MandrillRequest
