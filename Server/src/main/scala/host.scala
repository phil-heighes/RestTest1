import java.net.{InetAddress, Inet4Address}
import javax.ws.rs.{GET, Path}

/**
 * Created by phil on 18/01/2015.
 */
@Path("/host")
class host {

  @GET
  def name() = "Hello World from host: " + InetAddress.getLocalHost.getHostName + " " + InetAddress.getLocalHost.getHostAddress
}
