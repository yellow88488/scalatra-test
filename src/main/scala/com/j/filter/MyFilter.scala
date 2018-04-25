package com.j.filter

import org.scalatra.{ScalatraFilter}
import org.slf4j.LoggerFactory

/**
  * Created by jufeng on 2018/4/24.
  */
class MyFilter extends ScalatraFilter {
  val logger =  LoggerFactory.getLogger(getClass)
  before(){
    contentType = "application/json;charset=UTF-8"
    logger.info("/filter")
  }
}
