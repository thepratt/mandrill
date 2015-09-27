package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.MandrillRequest

case class Info(key: String, id: String) extends MandrillRequest
