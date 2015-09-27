package com.aristocrat.mandrill.requests.Subaccounts

import com.aristocrat.mandrill.requests.MandrillRequest

case class Delete(key: String, id: String) extends MandrillRequest
