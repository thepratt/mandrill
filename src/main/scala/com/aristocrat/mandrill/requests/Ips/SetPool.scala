package com.aristocrat.mandrill.requests.Ips

case class SetPool(
    key: String,
    ip: String,
    pool: String,
    createPool: Boolean)
