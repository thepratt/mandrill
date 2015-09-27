package com.aristocrat.mandrill.requests.Inbound

import com.aristocrat.mandrill.requests.MandrillRequest

case class SendRaw(
    key: String,
    rawMessage: String,
    to: Option[Seq[String]] = None,
    mailFrom: Option[String] = None,
    helo: Option[String] = None,
    clientAddress: Option[String] = None) extends MandrillRequest
