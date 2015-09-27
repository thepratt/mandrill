package com.aristocrat.mandrill.requests.Metadata

import com.aristocrat.mandrill.requests.MandrillRequest

case class Delete(key: String, name: String) extends MandrillRequest
