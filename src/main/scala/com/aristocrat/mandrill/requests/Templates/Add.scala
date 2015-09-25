package com.aristocrat.mandrill.requests.Templates

case class Add(
    key: String,
    name: String,
    fromEmail: String,
    fromName: String,
    subject: String,
    code: String,
    text: String,
    publish: Boolean,
    labels: Seq[String])
