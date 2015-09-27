package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.MandrillRequest

case class CancelScheduled(key: String, id: String) extends MandrillRequest
