package com.aristocrat.mandrill.requests.Webhooks

case class Update(
    key: String,
    id: Int,
    url: String,
    description: String,
    // @OneOf(Events)
    events: Seq[String] = Seq())
