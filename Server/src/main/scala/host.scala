import javax.ws.rs.{GET, Path}

/**
 * Created by phil on 18/01/2015.
 */
@Path("/host")
class host {

  @GET
  def name() = "Hello World"
}
