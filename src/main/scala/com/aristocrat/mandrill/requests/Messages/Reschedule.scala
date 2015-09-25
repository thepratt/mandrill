package com.aristocrat.mandrill.requests.Messages

import org.joda.time.DateTime

case class Reschedule(key: String, id: String, sendAt: DateTime)
