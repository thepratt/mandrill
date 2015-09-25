package com.aristocrat.mandrill.requests.Subaccounts

case class Update(
    key: String,
    id: String,
    name: String,
    notes: String,
    customQuota: Int)
