package com.aristocrat.mandrill

import com.aristocrat.mandrill.requests.MandrillRequest
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response.Ok
import com.twitter.finagle.httpx.{Message, Response}
import com.twitter.finatra.annotations.Flag
import com.twitter.finatra.httpclient.modules.HttpClientModule
import com.twitter.finatra.httpclient.{HttpClient, RequestBuilder}
import com.twitter.finatra.json.FinatraObjectMapper
import com.twitter.inject.Logging
import com.twitter.util.{Base64StringEncoder, Future}
import org.jboss.netty.handler.codec.http.HttpHeaders

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
    @Flag("mandrill.enabled") enabled: Boolean,
    @Flag("mandrill.username") username: String,
    @Flag("mandrill.token") token: String) {

    lazy val authorization = "Basic " + Base64StringEncoder.encode(s"$username:$token".toCharArray.map(_.toByte))

    def post(path: String, body: MandrillRequest): Future[Response] = {
        val request = RequestBuilder
            .post(s"/api/1.0/$path")
            .body(mapper.writeValueAsString(body))
            .headers(
                Map(
                    HttpHeaders.Names.CONTENT_TYPE -> Message.ContentTypeJson,
                    HttpHeaders.Names.AUTHORIZATION -> authorization
                )
            )

        for {
            response <- if (enabled) httpClient.execute(request) else Future(new Ok)
        } yield response
    }

}

