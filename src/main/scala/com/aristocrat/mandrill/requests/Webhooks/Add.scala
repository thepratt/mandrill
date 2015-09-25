package com.aristocrat.mandrill.requests.Webhooks

case class Add(
    key: String,
    url: String,
    description: String,
    // @OneOf(Events)
    events: Seq[String] = Seq())
