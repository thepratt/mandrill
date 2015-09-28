package com.aristocrat.mandrill.services

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Users.{Info, Ping, Senders}
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class UsersService @Inject()(client: MandrillClient) {

    def info(body: Info): Future[Response] = client.post("users/info.json", body)

    def ping(body: Ping): Future[Response] = client.post("users/ping.json", body)

    def senders(body: Senders): Future[Response] = client.post("users/senders.json", body)

}
