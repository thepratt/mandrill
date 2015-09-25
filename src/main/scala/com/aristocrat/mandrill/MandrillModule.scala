package com.aristocrat.mandrill

import com.google.inject.{Inject, Singleton}
import com.twitter.finatra.annotations.Flag
import com.twitter.finatra.httpclient.HttpClient
import com.twitter.finatra.httpclient.modules.HttpClientModule
import com.twitter.finatra.json.FinatraObjectMapper
import com.twitter.inject.Logging

object MandrillModule extends HttpClientModule with Logging {

    val enabled = flag("mandrill.enabled", false, "Enable sending requests to mandrill")
    val username = flag("mandrill.username", "", "Valid username for mandrill")
    val token = flag("mandrill.token", "", "Valid api token for mandrill")

    override def hostname = "mandrillapp.com"
    override def sslHostname = Some(s"$hostname:443")
    override def dest = s"$hostname:80"
}

@Singleton
class MandrillClient @Inject()(
    httpClient: HttpClient,
    mapper: FinatraObjectMapper,
    @Flag("mandrill.enabled") enabled: String,
    @Flag("mandrill.username") username: String,
    @Flag("mandrill.token") token: String) {

    def get() = "get"

    def post() = "post"

}

