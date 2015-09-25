package com.aristocrat.mandrill.requests

case class Recipient(
    email: String,
    name: Option[String] = None,
    `type`: String = Recipient.TO)

object Recipient {
    final var TO = "to"
    final var CC = "cc"
    final var BCC = "bcc"
}
