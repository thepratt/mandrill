package com.aristocrat.mandrill.requests.Messages

import com.aristocrat.mandrill.requests.MandrillRequest
import org.joda.time.DateTime

case class Reschedule(key: String, id: String, sendAt: DateTime) extends MandrillRequest
