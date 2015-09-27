package com.aristocrat.mandrill.requests.Urls

import com.aristocrat.mandrill.requests.MandrillRequest

case class AddTrackingDomain(key: String, domain: String) extends MandrillRequest
