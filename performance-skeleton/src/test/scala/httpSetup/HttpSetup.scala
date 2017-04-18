package httpSetup

import io.gatling.http.Predef._
import io.gatling.core.Predef._

/**
  * Created by sripadmasudha on 12/04/17.
  */
object HttpSetup {
      val httpProtocol = http
        .baseURL("https://www.google.com")
        .contentTypeHeader("application/json")
}