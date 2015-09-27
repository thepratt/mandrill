package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.MandrillRequest

case class ListScheduled(key: String, to: String) extends MandrillRequest
