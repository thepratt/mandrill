package com.aristocrat.mandrill.services

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Messages._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class MessagesService @Inject()(client: MandrillClient) {

    def send(body: Send): Future[Response] = client.post("messages/send.json", body)

    def sendTemplate(body: SendTemplate): Future[Response] = client.post("messages/send-template.json", body)

    def search(body: Search): Future[Response] = client.post("messages/search.json", body)

    def searchTimeSeries(body: SearchTimeSeries): Future[Response] = client.post("messages/search-time-series.json", body)

    def info(body: Info): Future[Response] = client.post("messages/info.json", body)

    def content(body: Content): Future[Response] = client.post("messages/content.json", body)

    def parse(body: Parse): Future[Response] = client.post("messages/parse.json", body)

    def sendRaw(body: SendRaw): Future[Response] = client.post("messages/send-raw.json", body)

    def listScheduled(body: ListScheduled): Future[Response] = client.post("messages/list-scheduled.json", body)

    def cancelScheduled(body: CancelScheduled): Future[Response] = client.post("messages/cancel-scheduled.json", body)

    def reschedule(body: Reschedule): Future[Response] = client.post("messages/reschedule.json", body)

}
