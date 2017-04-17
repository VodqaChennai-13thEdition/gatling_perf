package httpSetup

import io.gatling.http.Predef._
import io.gatling.core.Predef._
/**
  * Created by sripadmasudha on 13/04/17.
  */
object LoginHttpSetup {
  val httpProtocol = http
    .baseURL("http://phptravels.net")
    .contentTypeHeader("application/json")
}

