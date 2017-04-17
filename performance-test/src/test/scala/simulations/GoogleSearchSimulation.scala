package simulations

import _root_.scenario.{GoogleHomeScenario, PhpLoginScenario}
import httpSetup.LoginHttpSetup
import io.gatling.core.Predef._

/**
  * Created by sripadmasudha on 13/04/17.
  */
class GoogleSearchSimulation extends Simulation {
//  val httpConf = HttpSetup.httpProtocol
//  val scn = GoogleHomeScenario.googleScenario
//
//  setUp(
//    scn.inject(atOnceUsers(50)).protocols(httpConf)).assertions(forAll.failedRequests.count.is(0))

  val httpSetup = LoginHttpSetup.httpProtocol
  val scn = PhpLoginScenario.loginScenario

  setUp(scn.inject(atOnceUsers(5)))
    .protocols(httpSetup).assertions(forAll.failedRequests.count.is(0))
}