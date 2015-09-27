package com.aristocrat.mandrill.requests.Urls

import com.aristocrat.mandrill.requests.MandrillRequest

case class CheckTrackingDomain(key: String, domain: String) extends MandrillRequest
