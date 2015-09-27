package com.aristocrat.mandrill.requests.Ips

import com.aristocrat.mandrill.requests.MandrillRequest

case class PoolInfo(key: String, pool: String) extends MandrillRequest
