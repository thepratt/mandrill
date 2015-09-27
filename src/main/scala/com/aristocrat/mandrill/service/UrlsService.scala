package com.aristocrat.mandrill.service

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Urls._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class UrlsService @Inject()(client: MandrillClient) {

    def list(body: List): Future[Response] = client.post("urls/list.json", body)

    def search(body: Search): Future[Response] = client.post("urls/search.json", body)

    def timeSeries(body: TimeSeries): Future[Response] = client.post("urls/time-series.json", body)

    def trackingDomains(body: TrackingDomains): Future[Response] = client.post("urls/tracking-domains.json", body)

    def addTrackingDomain(body: AddTrackingDomain): Future[Response] = client.post("urls/add-tracking-domain.json", body)

    def checkTrackingDomain(body: CheckTrackingDomain): Future[Response] = client.post("urls/check-tracking-domain.json", body)

}
