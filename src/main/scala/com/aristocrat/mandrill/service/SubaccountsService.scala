package com.aristocrat.mandrill.service

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Subaccounts._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class SubaccountsService @Inject()(client: MandrillClient) {

    def list(body: List): Future[Response] = client.post("subaccounts/list.json", body)

    def add(body: Add): Future[Response] = client.post("subaccounts/add.json", body)

    def info(body: Info): Future[Response] = client.post("subaccounts/info.json", body)

    def update(body: Update): Future[Response] = client.post("subaccounts/update.json", body)

    def delete(body: Delete): Future[Response] = client.post("subaccounts/delete.json", body)

    def pause(body: Pause): Future[Response] = client.post("subaccounts/pause.json", body)

    def resume(body: Resume): Future[Response] = client.post("subaccounts/resume.json", body)

}
