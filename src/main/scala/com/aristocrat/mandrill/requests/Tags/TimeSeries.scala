package com.aristocrat.mandrill.requests.Tags

import com.aristocrat.mandrill.requests.MandrillRequest

case class TimeSeries(key: String, tag: String) extends MandrillRequest
