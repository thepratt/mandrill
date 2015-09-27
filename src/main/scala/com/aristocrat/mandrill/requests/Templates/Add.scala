package com.aristocrat.mandrill.requests.Templates

import com.aristocrat.mandrill.requests.MandrillRequest

case class Add(
    key: String,
    name: String,
    fromEmail: String,
    fromName: String,
    subject: String,
    code: String,
    text: String,
    publish: Boolean,
    labels: Seq[String]) extends MandrillRequest
