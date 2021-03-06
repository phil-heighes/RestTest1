import javax.ws.rs.core.Response

import org.jboss.resteasy.client.jaxrs.{ResteasyClient, ResteasyClientBuilder, ResteasyWebTarget}


/**
 * Created by phil on 18/01/2015.
 */
object  MyApp {
  def main(args: Array[String]) {
    val client = new ResteasyClientBuilder().build()

    val servers = List("localhost:8080")
    servers.foreach(s => {
      val target = client.target("http://" + s + "/RestServer-1.0-SNAPSHOT/server/host")
      val response = target.request().get()
      val value = response.readEntity(classOf[String])
      println("Response: " + value)
    })
 }
}