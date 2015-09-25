package com.aristocrat.mandrill.requests.Ips

case class Provision(
    key: String,
    warmup: Boolean,
    pool: String)
