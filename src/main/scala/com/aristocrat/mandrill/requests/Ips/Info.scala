package com.aristocrat.mandrill.requests.Ips

import com.aristocrat.mandrill.requests.MandrillRequest

case class Info(key: String, ip: String) extends MandrillRequest
