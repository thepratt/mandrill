package com.aristocrat.mandrill.requests.Ips

import com.aristocrat.mandrill.requests.MandrillRequest

case class CreatePool(key: String, pool: String) extends MandrillRequest
