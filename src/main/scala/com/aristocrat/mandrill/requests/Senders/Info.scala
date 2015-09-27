package com.aristocrat.mandrill.requests.Senders

import com.aristocrat.mandrill.requests.MandrillRequest

case class Info(key: String, address: String) extends MandrillRequest
