package com.aristocrat.mandrill.requests

case class MergeVar(name: String, content: String)

case class MergeVarGroup(rcpt: String, vars: Seq[MergeVar] = Seq())
