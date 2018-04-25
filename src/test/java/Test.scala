/**
  * Created by jufeng on 2018/4/24.
  */
object Test {

  def main(args: Array[String]): Unit = {
    val pattern = "([A-Z]){1}".r
    val simpleName = "User"
    val s = pattern.findAllIn(simpleName).toArray;
    println(s.mkString(","))
    if (s.length>1){
      val indexStr = s(1)
      val res= simpleName.replace(indexStr,"_"+indexStr.toLowerCase).toLowerCase
      println("Dix= "+res)
    }else{
      println(simpleName.toLowerCase)
    }
  }


}
