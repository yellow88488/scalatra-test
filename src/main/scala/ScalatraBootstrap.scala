import javax.servlet.ServletContext

import com.j.cotroller.FlowersController
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {
    context mount (new FlowersController, "/flower/*")
  }
}