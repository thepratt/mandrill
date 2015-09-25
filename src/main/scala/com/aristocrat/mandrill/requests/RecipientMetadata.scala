package com.aristocrat.mandrill.requests

case class RecipientMetadata(rcpt: String, values: Map[String, String] = Map())
