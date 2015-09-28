package com.aristocrat.mandrill.services

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Metadata._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class MetadataService @Inject()(client: MandrillClient) {

    def list(body: List): Future[Response] = client.post("metadata/list.json", body)

    def add(body: Add): Future[Response] = client.post("metadata/add.json", body)

    def update(body: Update): Future[Response] = client.post("metadata/update.json", body)

    def delete(body: Delete): Future[Response] = client.post("metadata/delete.json", body)

}
