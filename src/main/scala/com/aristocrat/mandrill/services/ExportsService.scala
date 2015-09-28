package com.aristocrat.mandrill.services

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Exports._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class ExportsService @Inject()(client: MandrillClient) {

    def info(body: Info): Future[Response] = client.post("exports/info.json", body)

    def list(body: List): Future[Response] = client.post("exports/list.json", body)

    def rejects(body: Rejects): Future[Response] = client.post("exports/rejects.json", body)

    def whitelist(body: Whitelist): Future[Response] = client.post("exports/whitelist.json", body)

    def activity(body: Activity): Future[Response] = client.post("exports/activity.json", body)

}
