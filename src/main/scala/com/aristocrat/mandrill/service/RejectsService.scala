package com.aristocrat.mandrill.service

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Rejects._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class RejectsService @Inject()(client: MandrillClient) {

    def add(body: Add): Future[Response] = client.post("rejects/add.json", body)

    def list(body: List): Future[Response] = client.post("rejects/list.json", body)

    def delete(body: Delete): Future[Response] = client.post("rejects/delete.json", body)

}
