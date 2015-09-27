package com.aristocrat.mandrill.requests.Exports

import com.aristocrat.mandrill.requests.MandrillRequest

case class Whitelist(key: String, notifyEmail: String) extends MandrillRequest
