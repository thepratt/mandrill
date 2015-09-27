package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.MandrillRequest

case class Content(key: String, id: String) extends MandrillRequest
