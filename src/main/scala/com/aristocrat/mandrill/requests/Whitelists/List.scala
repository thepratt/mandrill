package com.aristocrat.mandrill.requests.Whitelists

import com.aristocrat.mandrill.requests.MandrillRequest

case class List(key: String, email: String) extends MandrillRequest
