package com.j
import com.j.models.{DictMz, User}
import io.getquill._


/**
  * Created by jufeng on 2018/4/25.
  */
object Quill {
  lazy val ctx = new MysqlJdbcContext(SnakeCase, "ctx")
  import ctx._
  val q = quote{
    query[DictMz].filter(mz=> mz.name=="东乡族")
  }

  def main(args: Array[String]): Unit = {
    println(ctx.run(q).toList.head)
  }

}
