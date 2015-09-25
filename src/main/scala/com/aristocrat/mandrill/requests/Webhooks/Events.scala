package com.aristocrat.mandrill.requests.Webhooks

object Events {
    final val SEND = "send"
    final val HARD_BOUNCE = "hard_bounce"
    final val SOFT_BOUNCE = "soft_bounce"
    final val OPEN = "open"
    final val CLICK = "click"
    final val SPAM = "spam"
    final val UNSUB = "unsub"
    final val REJECT = "reject"
    final val BLACKLIST = "blacklist"
    final val WHITELIST = "whitelist"
}
