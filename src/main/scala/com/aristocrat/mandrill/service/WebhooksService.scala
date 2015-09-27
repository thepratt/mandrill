package com.aristocrat.mandrill.service

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Webhooks._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class WebhooksService @Inject()(client: MandrillClient) {

    def list(body: List): Future[Response] = client.post("webhooks/list.json", body)

    def add(body: Add): Future[Response] = client.post("webhooks/add.json", body)

    def info(body: Info): Future[Response] = client.post("webhooks/info.json", body)

    def update(body: Update): Future[Response] = client.post("webhooks/update.json", body)

    def delete(body: Delete): Future[Response] = client.post("webhooks/delete.json", body)

}
