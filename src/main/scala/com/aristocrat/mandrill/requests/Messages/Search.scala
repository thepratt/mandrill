package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.MandrillRequest
import org.joda.time.DateTime

case class Search(
    key: String,
    query: Option[String] = None,
    dateFrom: Option[DateTime] = None,
    dateTo: Option[DateTime] = None,
    tags: Seq[String] = Seq(),
    senders: Seq[String] = Seq(),
    apiKeys: Seq[String] = Seq(),
    // max is 1000
    limit: Int = 100) extends MandrillRequest
