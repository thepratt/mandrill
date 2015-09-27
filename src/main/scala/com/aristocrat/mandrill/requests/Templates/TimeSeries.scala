package com.aristocrat.mandrill.requests.Templates

import com.aristocrat.mandrill.requests.MandrillRequest

case class TimeSeries(key: String, name: String) extends MandrillRequest
