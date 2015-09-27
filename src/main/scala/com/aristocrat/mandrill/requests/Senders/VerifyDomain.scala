package com.aristocrat.mandrill.requests.Senders

import com.aristocrat.mandrill.requests.MandrillRequest

case class VerifyDomain(key: String, domain: String, mailbox: String) extends MandrillRequest
