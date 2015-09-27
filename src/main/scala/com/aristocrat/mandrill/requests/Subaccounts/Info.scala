package com.aristocrat.mandrill.requests.Subaccounts

import com.aristocrat.mandrill.requests.MandrillRequest

case class Info(key: String, id: String) extends MandrillRequest
