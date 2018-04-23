package com.j.cotroller

import com.j.data.FlowerData
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport

/**
  * Created by jufeng on 2018/4/23.
  */
class FlowersController extends ScalatraServlet with JacksonJsonSupport{
  override protected implicit def jsonFormats: Formats = DefaultFormats
  // Before every action runs, set the content type to be in JSON format.
  before() {
    contentType = formats("json")
  }

  get("/all"){
    FlowerData.all
  }


}
