package com.j.service
import com.j.db.DbContext._
import io.getquill._
/**
  * Created by jufeng on 2018/4/25.
  */
trait BaseService {

  def transaction[T](f: => T)={
    ctx.transaction(f)
  }
}
