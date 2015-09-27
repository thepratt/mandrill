package com.aristocrat.mandrill.requests.Webhooks

import com.aristocrat.mandrill.requests.MandrillRequest

case class Update(
    key: String,
    id: Int,
    url: String,
    description: String,
    // @OneOf(Events)
    events: Seq[String] = Seq()) extends MandrillRequest
