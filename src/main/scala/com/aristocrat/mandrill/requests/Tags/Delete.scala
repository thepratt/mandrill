package com.aristocrat.mandrill.requests.Tags

import com.aristocrat.mandrill.requests.MandrillRequest

case class Delete(key: String, tag: String) extends MandrillRequest
