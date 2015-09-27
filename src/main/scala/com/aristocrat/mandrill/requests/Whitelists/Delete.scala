package com.aristocrat.mandrill.requests.Whitelists

import com.aristocrat.mandrill.requests.MandrillRequest

case class Delete(key: String, email: String) extends MandrillRequest
