package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.Message
import org.joda.time.DateTime

case class SendTemplate(
    key: String,
    templateName: String,
    templateContent: Seq[String],
    message: Message,
    async: Boolean,
    ipPool: String,
    sendAt: DateTime)
