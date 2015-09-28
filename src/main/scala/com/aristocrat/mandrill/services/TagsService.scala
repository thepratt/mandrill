package com.aristocrat.mandrill.services

import com.aristocrat.mandrill.MandrillClient
import com.google.inject.{Inject, Singleton}
import com.aristocrat.mandrill.requests.Tags._
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class TagsService @Inject()(client: MandrillClient) {

    def list(body: List): Future[Response] = client.post("tags/list.json", body)

    def delete(body: Delete): Future[Response] = client.post("tags/delete.json", body)

    def info(body: Info): Future[Response] = client.post("tags/info.json", body)

    def timeSeries(body: TimeSeries): Future[Response] = client.post("tags/time-series.json", body)

    def allTimeSeries(body: AllTimeSeries): Future[Response] = client.post("tags/all-time-series.json", body)

}
