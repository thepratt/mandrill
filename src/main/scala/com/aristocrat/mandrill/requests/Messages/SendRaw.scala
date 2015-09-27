package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.MandrillRequest
import org.joda.time.DateTime

case class SendRaw(
    key: String,
    rawMessage: String,
    fromEmail: Option[String],
    fromName: Option[String],
    to: Option[Seq[String]],
    async: Boolean,
    ipPool: String,
    sendAt: DateTime,
    returnPathDomain: String) extends MandrillRequest
