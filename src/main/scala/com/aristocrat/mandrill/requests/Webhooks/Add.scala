package com.aristocrat.mandrill.requests.Webhooks

import com.aristocrat.mandrill.requests.MandrillRequest

case class Add(
    key: String,
    url: String,
    description: String,
    // @OneOf(Events)
    events: Seq[String] = Seq()) extends MandrillRequest
