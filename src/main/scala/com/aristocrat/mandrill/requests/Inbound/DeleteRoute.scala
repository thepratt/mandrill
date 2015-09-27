package com.aristocrat.mandrill.requests.Inbound

import com.aristocrat.mandrill.requests.MandrillRequest

case class DeleteRoute(key: String, id: String) extends MandrillRequest
