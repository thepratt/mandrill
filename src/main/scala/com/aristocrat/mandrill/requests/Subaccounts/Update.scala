package com.aristocrat.mandrill.requests.Subaccounts

import com.aristocrat.mandrill.requests.MandrillRequest

case class Update(
    key: String,
    id: String,
    name: String,
    notes: String,
    customQuota: Int) extends MandrillRequest
