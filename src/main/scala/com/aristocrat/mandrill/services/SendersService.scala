package com.aristocrat.mandrill.services

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Senders._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class SendersService @Inject()(client: MandrillClient) {

    def list(body: List): Future[Response] = client.post("senders/list.json", body)

    def domains(body: Domains): Future[Response] = client.post("senders/domains.json", body)

    def addDomain(body: AddDomain): Future[Response] = client.post("senders/add-domain.json", body)

    def checkDomain(body: CheckDomain): Future[Response] = client.post("senders/check-domain.json", body)

    def verifyDomain(body: VerifyDomain): Future[Response] = client.post("senders/verify-domain.json", body)

    def info(body: Info): Future[Response] = client.post("senders/info.json", body)

    def timeSeries(body: TimeSeries): Future[Response] = client.post("senders/time-series.json", body)

}
