package query

import io.gatling.core.Predef._
import io.gatling.http.Predef._
/**
  * Created by sripadmasudha on 13/04/17.
  */
object HomePageQuery {

  val gethomepage = http("request_2").get("/admin")

}