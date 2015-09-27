package com.aristocrat.mandrill.requests.Urls

import com.aristocrat.mandrill.requests.MandrillRequest

case class Search(key: String, q: String) extends MandrillRequest
