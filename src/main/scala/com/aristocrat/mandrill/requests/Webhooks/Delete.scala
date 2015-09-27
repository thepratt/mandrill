package com.aristocrat.mandrill.requests.Webhooks

import com.aristocrat.mandrill.requests.MandrillRequest

case class Delete(key: String, id: Int) extends MandrillRequest
