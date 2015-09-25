package com.aristocrat.mandrill.requests

import com.fasterxml.jackson.annotation.JsonProperty

case class Message(
    html: Option[String] = None,
    text: Option[String] = None,
    subject: Option[String] = None,
    fromEmail: Option[String] = None,
    fromName: Option[String] = None,
    to: Seq[Recipient],
    headers: Map[String, String] = Map(),
    important: Boolean = false,
    trackOpens: Boolean = false,
    trackClicks: Boolean = false,
    autoText: Boolean = false,
    autoHtml: Boolean = false,
    inlineCss: Boolean = false,
    urlStripQs: Boolean = false,
    preserveRecipients: Boolean = false,
    viewContentLink: Boolean = false,
    bccAddress: Option[String] = None,
    trackingDomain: Option[String] = None,
    signingDomain: Option[String] = None,
    returnPathDomain: Option[String] = None,
    merge: Boolean = true,
    mergeLanguage: String = MergeLanguage.MAILCHIMP,
    globalMergeVars: Seq[MergeVar] = Seq(),
    mergeVars: Seq[MergeVarGroup] = Seq(),
    tags: Seq[String] = Seq(),
    @JsonProperty("subaccount") subAccount: Option[String] = None,
    googleAnalyticsDomains: Seq[String] = Seq(),
    metadata: Map[String, String] = Map(),
    recipientMetadata: Seq[RecipientMetadata] = Seq(),
    attachments: Seq[Attachment] = Seq(),
    images: Seq[Image] = Seq())

object MergeLanguage {
    final val MAILCHIMP = "mailchimp"
    final val HANDLEBARS = "handlebars"
}
