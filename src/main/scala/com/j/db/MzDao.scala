package com.j.db
import io.getquill._
import DbContext.ctx._
import com.j.models.DictMz

/**
  * Created by jufeng on 2018/4/25.
  */
object MzDao {

  val find_all = quote{
      query[DictMz].filter(_.id >0 )
  }
  def findAll() = {
    run(find_all).toList
  }

}
