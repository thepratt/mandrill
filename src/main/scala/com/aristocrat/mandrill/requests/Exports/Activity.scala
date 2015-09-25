package com.aristocrat.mandrill.requests.Exports

import org.joda.time.DateTime

case class Activity(
    key: String,
    notifyEmail: Option[String] = None,
    dateFrom: Option[DateTime] = None,
    dateTo: Option[DateTime] = None,
    tags: Seq[String] = Seq(),
    senders: Seq[String] = Seq(),
    states: Seq[String] = Seq(),
    apiKeys: Seq[String] = Seq())
