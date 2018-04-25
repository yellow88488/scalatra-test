package com.j.db
import io.getquill._
/**
  * Created by jufeng on 2018/4/25.
  */
object DbContext {
  lazy val ctx = new MysqlJdbcContext(SnakeCase, "ctx")
  //ctx.transaction()
}
