package com.j.models

/*
import com.github.aselab.activerecord._
import com.github.aselab.activerecord.dsl._
import org.slf4j.LoggerFactory
*/

/**
  * Created by jufeng on 2018/4/24.
  */
object Table /*extends ActiveRecordTables {
  val logger =  LoggerFactory.getLogger(getClass)
  val dictMz = table[DictMz]
  val user = table[User]

  override def tableNameFromClass(c: Class[_]): String={
    val pattern = "([A-Z]){1}".r
    val simpleName = c.getSimpleName
    val s = pattern.findAllIn(simpleName).toArray;
    if (s.length>1){
      val indexStr = s(1)
      simpleName.replace(indexStr,"_"+indexStr.toLowerCase).toLowerCase
    }else{
      simpleName.toLowerCase
    }
  }
}
*/