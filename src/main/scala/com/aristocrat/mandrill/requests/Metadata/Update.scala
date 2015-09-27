package com.aristocrat.mandrill.requests.Metadata

import com.aristocrat.mandrill.requests.MandrillRequest

case class Update(key: String, name: String, viewTemplate: String) extends MandrillRequest
