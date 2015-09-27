package com.aristocrat.mandrill.requests.Ips

import com.aristocrat.mandrill.requests.MandrillRequest

case class Delete(key: String, ip: String) extends MandrillRequest
