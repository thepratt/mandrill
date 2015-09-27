package com.aristocrat.mandrill.requests.Ips

import com.aristocrat.mandrill.requests.MandrillRequest

case class Provision(
    key: String,
    warmup: Boolean,
    pool: String) extends MandrillRequest
