package com.j.models
import com.j.db.DbContext.ctx._
import com.j.models.DictMz
/**
  * Created by jufeng on 2018/4/24.
  * Model implementation:
  */
case  class DictMz (
                   id:Long,
                   name:String,
                   zjm:String
                   )

/*case object DictMz{
  val find_all = quote{
    query[DictMz].filter(_.id >0 )
  }
  def findAll() = {
    run(find_all).toList
  }
}*/
