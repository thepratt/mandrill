package com.aristocrat.mandrill.services

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Templates._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class TemplatesService @Inject()(client: MandrillClient) {

    def add(body: Add): Future[Response] = client.post("templates/add.json", body)

    def info(body: Info): Future[Response] = client.post("templates/info.json", body)

    def update(body: Update): Future[Response] = client.post("templates/update.json", body)

    def publish(body: Publish): Future[Response] = client.post("templates/publish.json", body)

    def delete(body: Delete): Future[Response] = client.post("templates/delete.json", body)

    def list(body: List): Future[Response] = client.post("templates/list.json", body)

    def timeSeries(body: TimeSeries): Future[Response] = client.post("templates/time-series.json", body)

    def render(body: Render): Future[Response] = client.post("templates/render.json", body)

}
