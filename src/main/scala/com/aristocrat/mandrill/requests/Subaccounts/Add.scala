package com.aristocrat.mandrill.requests.Subaccounts

case class Add(
    key: String,
    id: String,
    name: String,
    notes: String,
    customQuota: Int)
