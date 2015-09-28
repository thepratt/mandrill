package com.aristocrat.mandrill.services

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Inbound._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class InboundService @Inject()(client: MandrillClient) {

    def domains(body: Domains): Future[Response] = client.post("inbound/domains.json", body)

    def addDomain(body: AddDomain): Future[Response] = client.post("inbound/add-domain.json", body)

    def checkDomain(body: CheckDomain): Future[Response] = client.post("inbound/check-domain.json", body)

    def deleteDomain(body: DeleteDomain): Future[Response] = client.post("inbound/delete-domain.json", body)

    def routes(body: Routes): Future[Response] = client.post("inbound/routes.json", body)

    def addRoute(body: AddRoute): Future[Response] = client.post("inbound/add-route.json", body)

    def updateRoute(body: UpdateRoute): Future[Response] = client.post("inbound/update-route.json", body)

    def deleteRoute(body: DeleteRoute): Future[Response] = client.post("inbound/delete-route.json", body)

    def sendRaw(body: SendRaw): Future[Response] = client.post("inbound/send-raw.json", body)

}
