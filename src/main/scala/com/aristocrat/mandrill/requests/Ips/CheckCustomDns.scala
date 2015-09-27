package com.aristocrat.mandrill.requests.Ips

import com.aristocrat.mandrill.requests.MandrillRequest

case class CheckCustomDns(key: String, ip: String, domain: String) extends MandrillRequest
