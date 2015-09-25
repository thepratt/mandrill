package com.aristocrat.mandrill.requests.Inbound

case class AddRoute(
    key: String,
    domain: String,
    pattern: String,
    url: String)
