package com.j

import io.getquill.ast.OnConflict.Properties
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.DefaultServlet
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener

/**
  * Created by jufeng on 2018/4/25.
  */
object JettyLauncher {

  def main(args: Array[String]): Unit = {
    //val port = if(System.getenv("PORT") != null) System.getenv("PORT").toInt else 8080
    val port = 8090
    val server = new Server(port)
    //server.setAttribute()
    val context = new WebAppContext()
    context setContextPath "/"
    context.setResourceBase("/classes")
    context.addEventListener(new ScalatraListener)
    context.addServlet(classOf[DefaultServlet], "/")
    context.setInitParameter(ScalatraListener.LifeCycleKey, "com.j.ScalatraBootstrap")
    server.setHandler(context)
    server.start
    server.join
  }
}
