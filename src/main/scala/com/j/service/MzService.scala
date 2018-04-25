package com.j.service
import com.j.db.MzDao

/**
  * Created by jufeng on 2018/4/25.
  */
object MzService extends BaseService{

  def findAll() = {
    //添加事物处理
    transaction{
      MzDao.findAll()
    }
  }
}
