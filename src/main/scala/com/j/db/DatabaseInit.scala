package com.j.db

/*
import com.mchange.v2.c3p0.ComboPooledDataSource
import org.slf4j.LoggerFactory
import org.squeryl.adapters.MySQLAdapter
import org.squeryl.{Session, SessionFactory}
*/

/**
  * Created by jufeng on 2018/4/24.
  */
trait DatabaseInit {
  /*val logger = LoggerFactory.getLogger(getClass)
  val databaseUsername = "root"
  val databasePassword = "root"
  val databaseConnection = "jdbc:mysql://127.0.0.1:3306/sydn"
  var cpds = new ComboPooledDataSource

  def configureDb(): Unit ={
    cpds.setDriverClass("com.mysql.jdbc.Driver")
    cpds.setJdbcUrl(databaseConnection)
    cpds.setUser(databaseUsername)
    cpds.setPassword(databasePassword)

    cpds.setMinPoolSize(2)
    cpds.setAcquireIncrement(1)
    cpds.setMaxPoolSize(20)

    SessionFactory.concreteFactory = Some(() => connection)

    def connection = {
      logger.info("Creating connection with c3po connection pool")
      Session.create(cpds.getConnection, new MySQLAdapter)
    }

  }


  def closeDbConnection() {
    logger.info("Closing c3po connection pool")
    cpds.close()
  }*/
}
