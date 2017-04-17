package scenario

import query._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
/**
  * Created by sripadmasudha on 13/04/17.
  */
object PhpLoginScenario {

  val loginScenario = scenario("Login")
    .exec(PhpLoginQuery.loginpage)
    .pause(21)
    .exec(PhpLoginQuery.logincredentials)

}
