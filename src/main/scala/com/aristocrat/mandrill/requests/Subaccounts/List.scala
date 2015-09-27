package com.aristocrat.mandrill.requests.Subaccounts

import com.aristocrat.mandrill.requests.MandrillRequest

case class List(key: String, q: String) extends MandrillRequest
