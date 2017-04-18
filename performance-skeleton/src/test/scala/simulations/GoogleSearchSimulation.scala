package simulations

import _root_.scenario.GoogleHomeScenario
import httpSetup.HttpSetup
import io.gatling.core.Predef._

/**
  * Created by sripadmasudha on 13/04/17.
  */
class GoogleSearchSimulation extends Simulation {
  val httpConf = HttpSetup.httpProtocol
  val scn = GoogleHomeScenario.googleScenario

  setUp(
    scn.inject(atOnceUsers(50)).protocols(httpConf)).assertions(forAll.failedRequests.count.is(0))

}