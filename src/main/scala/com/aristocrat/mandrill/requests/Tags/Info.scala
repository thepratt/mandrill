package com.aristocrat.mandrill.requests.Tags

import com.aristocrat.mandrill.requests.MandrillRequest

case class Info(key: String, tag: String) extends MandrillRequest
