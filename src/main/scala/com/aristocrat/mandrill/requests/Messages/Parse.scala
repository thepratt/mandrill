package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.MandrillRequest

case class Parse(key: String, rawMessage: String) extends MandrillRequest
