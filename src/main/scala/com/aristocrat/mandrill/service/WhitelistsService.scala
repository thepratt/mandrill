package com.aristocrat.mandrill.service

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Whitelists._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class WhitelistsService @Inject()(client: MandrillClient) {

    def add(body: Add): Future[Response] = client.post("whitelists/add.json", body)

    def list(body: List): Future[Response] = client.post("whitelists/list.json", body)

    def delete(body: Delete): Future[Response] = client.post("whitelists/delete.json", body)

}
