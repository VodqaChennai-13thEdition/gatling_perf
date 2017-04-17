package query

import io.gatling.core.Predef._
import io.gatling.http.Predef._
/**
  * Created by sripadmasudha on 13/04/17.
  */
object PhpLoginQuery {

  val loginpage = http("request_0")
    .get("/admin")

  val logincredentials = http("request_1")
    .post("/admin/login")
    .formParam("email", "admin@phptravels.com")
    .formParam("password", "demoadmin")
    .resources(http("request_2").get("/admin"),http("request_3").get("/assets/include/pace/pace.min.js"),
        http("request_4").get("/assets/include/alert/js/alert.js"),
        http("request_5").get("/assets/include/jquery-form/jquery.form.min.js"),
        http("request_6").get("/assets/js/bootstrap.min.js"),
        http("request_7").get("/assets/js/panels.js"),
        http("request_8").get("/assets/js/funcs.js"),
        http("request_9").get("/assets/xcrud/plugins/xcrud.js"),
        http("request_10").get("/assets/include/timepicker/timepicker.js"),
        http("request_11").get("/assets/include/pnotify/pnotify.custom.min.js"),
        http("request_12").get("/assets/include/select2/select2.min.js"),
        http("request_13").get("/assets/xcrud/plugins/jcrop/jquery.Jcrop.min.js"),
        http("request_14").get("/assets/js/bootstrap-hover-dropdown.min.js"),
        http("request_15").get("/assets/include/datepicker/datepicker.js"),
        http("request_16").get("/assets/include/dropzone/dropzone.min.js"),
        http("request_17").get("/assets/js/sidebar.js"),
        http("request_18").get("/assets/js/jquery.slimscroll.min.js"),
        http("request_19").get("/assets/xcrud/plugins/timepicker/jquery-ui-timepicker-addon.js"),
        http("request_20").get("/assets/include/smoothwheel/smoothwheel.js"),
        http("request_21").get("/assets/xcrud/plugins/jquery-ui/jquery-ui.min.js"),
        http("request_22").get("/assets/include/highcharts/highcharts.js"),
        http("request_23").get("/assets/include/ckeditor/ckeditor.js"),
        http("request_24").get("/assets/fonts/fa/fontawesome-webfont.woff2?v=4.3.0"),
        http("request_25").get("/assets/fonts/glyphicons-halflings-regular.woff2"))
    .check(status.is(200))

}