package com.aristocrat.mandrill.requests.Ips

import com.aristocrat.mandrill.requests.MandrillRequest

case class StartWarmup(key: String, ip: String) extends MandrillRequest
