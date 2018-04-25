package com.j.cotroller

import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json.JacksonJsonSupport
import org.slf4j.LoggerFactory

/**
  * Created by jufeng on 2018/4/24.
  */
trait JsonSupport extends JacksonJsonSupport{
  override protected implicit def jsonFormats: Formats = DefaultFormats
}
