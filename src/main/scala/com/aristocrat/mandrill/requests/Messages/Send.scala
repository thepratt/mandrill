package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.{MandrillRequest, Message}
import org.joda.time.DateTime

case class Send(
    key: String,
    message: Message,
    async: Boolean,
    ipPool: String,
    sendAt: DateTime) extends MandrillRequest
