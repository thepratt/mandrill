package com.aristocrat.mandrill.requests.Templates

import com.aristocrat.mandrill.requests.MandrillRequest

case class Delete(key: String, name: String) extends MandrillRequest
