package com.aristocrat.mandrill.requests.Urls

import com.aristocrat.mandrill.requests.MandrillRequest

case class TimeSeries(key: String, url: String) extends MandrillRequest
