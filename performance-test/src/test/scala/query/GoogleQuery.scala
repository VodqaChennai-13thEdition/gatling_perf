package query

import io.gatling.http.Predef._
import io.gatling.core.Predef._

object GoogleQuery {
  val query = http("Google")
    .get("/search")
    .check(status.is(200))

}
