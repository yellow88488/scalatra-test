package com.j

import javax.servlet.ServletContext

import com.j.cotroller.{FlowersController, MzController}
import com.j.filter.MyFilter
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle{

  override def init(context: ServletContext) {
    context.mount (new FlowersController, "/flower/*")
    context.mount (new MzController, "/mz/*")
    context.mount (new MyFilter, "/*")


  }

  override  def destroy(context :ServletContext){
    super.destroy(context)
    //closeDbConnection()
  }



  def initParam(context: ServletContext): Unit ={
    // List the hosts and ports which will be allowed to make cross-origin requests,
    // separated by commas (* by default).
    context.initParameters("org.scalatra.cors.allowedOrigins") = "http://example.com:8080,http://foo.example.com"

    // List what HTTP methods will be accepted.
    // Available options are GET, POST, PUT, DELETE, HEAD, OPTIONS, and PATCH.
    // All methods are accepted by default.
    context.initParameters("org.scalatra.cors.allowedMethods") = "GET"

    // Set a list of allowed HTTP headers, most headers are supported.
    context.initParameters("org.scalatra.cors.allowedHeaders") = "Content-Type"

    // Set the number of seconds that preflight requests can be cached by the client.
    // Default value is 0 seconds.
    context.initParameters("org.scalatra.cors.preflightMaxAge") = "1800"

    // By default, cookies are not included in CORS requests. Set this to `true` to allow cookies.
    context.initParameters("org.scalatra.cors.allowCredentials") = "true"

    // If CorsSupport needs to be disabled, set to false. Default: CorsSupport is enabled.
    context.initParameters("org.scalatra.cors.enable") = "false"
  }
}