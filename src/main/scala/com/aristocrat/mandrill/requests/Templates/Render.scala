package com.aristocrat.mandrill.requests.Templates

import com.aristocrat.mandrill.requests.MergeVar

case class Render(
    key: String,
    templateName: String,
    templateContent: Seq[MergeVar],
    mergeVars: Seq[MergeVar] = Seq())
