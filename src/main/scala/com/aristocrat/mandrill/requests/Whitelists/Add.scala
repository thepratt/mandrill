package com.aristocrat.mandrill.requests.Whitelists

case class Add(
    key: String,
    email: String,
    comment: String)
