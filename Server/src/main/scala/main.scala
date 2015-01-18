import java.util
import javax.ws.rs.{GET, ApplicationPath, Path}
import javax.ws.rs.core.Application

/**
 * Created by phil on 18/01/2015.
 */

@ApplicationPath("/server")
class server() extends Application {
  override def getClasses() : java.util.Set[scala.Predef.Class[_]] = new util.HashSet()
}
