package scenario

import query._
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object GoogleHomeScenario {
    val googleScenario = scenario("Google Home Page Scenario")
      .exec(GoogleQuery.query)
}