package com.aristocrat.mandrill.requests.Whitelists

import com.aristocrat.mandrill.requests.MandrillRequest

case class Add(key: String, email: String, comment: String) extends MandrillRequest
