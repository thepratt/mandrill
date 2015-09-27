package com.aristocrat.mandrill.requests.Senders

import com.aristocrat.mandrill.requests.MandrillRequest

case class TimeSeries(key: String, address: String) extends MandrillRequest
