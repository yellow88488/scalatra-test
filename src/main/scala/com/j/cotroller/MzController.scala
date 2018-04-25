package com.j.cotroller

import com.j.service.MzService
import org.json4s.{DefaultFormats, Formats, ShortTypeHints}
// JSON handling support from Scalatra
import org.scalatra.json._
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport
import org.slf4j.LoggerFactory
import org.json4s.JsonDSL._
/**
  * Created by jufeng on 2018/4/24.
  */
class MzController extends ScalatraServlet with JacksonJsonSupport{
  val logger =  LoggerFactory.getLogger(getClass)
  override protected implicit def jsonFormats: Formats = DefaultFormats
  get("/getById"){
    val id  = params("id").toLong
  }

  get("/list"){
    MzService.findAll()
  }

}
