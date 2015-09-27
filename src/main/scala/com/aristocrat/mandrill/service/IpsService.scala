package com.aristocrat.mandrill.service

import com.aristocrat.mandrill.MandrillClient
import com.aristocrat.mandrill.requests.Ips._
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.httpx.Response
import com.twitter.util.Future

@Singleton
class IpsService @Inject()(client: MandrillClient) {

    def list(body: List): Future[Response] = client.post("ips/list.json", body)

    def info(body: Info): Future[Response] = client.post("ips/info.json", body)

    def provision(body: Provision): Future[Response] = client.post("ips/provision.json", body)

    def startWarmup(body: StartWarmup): Future[Response] = client.post("ips/start-warmup.json", body)

    def cancelWarmup(body: CancelWarmup): Future[Response] = client.post("ips/cancel-warmup.json", body)

    def setPool(body: SetPool): Future[Response] = client.post("ips/set-pool.json", body)

    def delete(body: Delete): Future[Response] = client.post("ips/delete.json", body)

    def listPools(body: ListPools): Future[Response] = client.post("ips/list-pools.json", body)

    def poolInfo(body: PoolInfo): Future[Response] = client.post("ips/pool-info.json", body)

    def createPool(body: CreatePool): Future[Response] = client.post("ips/create-pool.json", body)

    def deletePool(body: DeletePool): Future[Response] = client.post("ips/delete-pool.json", body)

    def checkCustomDns(body: CheckCustomDns): Future[Response] = client.post("ips/check-custom-dns.json", body)

    def setCustomDns(body: SetCustomDns): Future[Response] = client.post("ips/set-custom-dns.json", body)

}
