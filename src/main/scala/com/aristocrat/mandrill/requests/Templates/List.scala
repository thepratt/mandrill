package com.aristocrat.mandrill.requests.Templates

import com.aristocrat.mandrill.requests.MandrillRequest

case class List(key: String, label: String) extends MandrillRequest
