package com.aristocrat.mandrill.requests.Inbound

case class UpdateRoute(
    key: String,
    id: String,
    pattern: String,
    url: String)
