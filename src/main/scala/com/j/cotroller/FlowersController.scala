package com.j.cotroller

import com.j.data.{Flower, FlowerData}
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport
import org.slf4j.LoggerFactory

/**
  * Created by jufeng on 2018/4/23.
  */
class FlowersController extends ScalatraServlet with JacksonJsonSupport{

  val logger =  LoggerFactory.getLogger(getClass)
  override protected implicit def jsonFormats: Formats = DefaultFormats
  // Before every action runs, set the content type to be in JSON format.
  //before() {
   // contentType = formats("json")
    //Scalatra has CORS support enabled by default
   // response.setHeader("Access-Control-Allow-Origin","*")
 // }

  get("/all"){
    logger.info("all")
    FlowerData.all
  }

  get("/getName"){
   // val name =params("name")
    val name =params.getOrElse("name","black")// 如果没有name参数的情况
    Flower(name,30)
  }


}
