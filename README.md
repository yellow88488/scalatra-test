# Scalatra Maven Prototype

Updated to run against Scalatra 2.6.3 and Scala 2.6.3

Also uses the new recommended ScalatraBootstrap/Lifecyle


scalatra-maven-prototype is a port of [scalatra-sbt-prototype](https://github.com/scalatra/scalatra-sbt-prototype) as an Apache Maven project.

scalatra-sbt-prototype is the defacto getting started example for the Scalatra framework. It uses SBT, which is great. This is its port to Apache Maven.

Why Apache Maven? So that your Scalatra project plays nice with your existing Maven infrastructure.

# Getting started


1. Change directory into your clone:

		cd my-app

2. Maven build

		mvn install

3. Start Jetty

		mvn jetty:run

4. Go to http://localhost:8080/flower/all  

Learn more about [Scalatra](http://www.scalatra.org/)
Learn more about [quill](https://github.com/getquill/quill)
