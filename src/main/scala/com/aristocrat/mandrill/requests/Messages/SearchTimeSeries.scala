package com.aristocrat.mandrill.requests.Messages

import org.joda.time.DateTime

case class SearchTimeSeries(
    key: String,
    query: String,
    dateFrom: DateTime,
    dateTo: DateTime,
    tags: Seq[String],
    apiKeys: Seq[String],
    limit: Int)
