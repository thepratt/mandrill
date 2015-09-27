package com.aristocrat.mandrill.requests.Ips

import com.aristocrat.mandrill.requests.MandrillRequest

case class SetPool(
    key: String,
    ip: String,
    pool: String,
    createPool: Boolean) extends MandrillRequest
