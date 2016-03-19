package pk.nimgade.test.api.messenger.support.test.one;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * This class exposes the URI with "helloworld" attached appended to the path
 * */
@Path("/helloworld")
public class HelloWorld {

	/**
	 * This is a test code which yields in "Hello World" text in plain text format 
	 * */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHellowWorld() {
		// TODO Auto-generated method stub
		return "Hello World";
	}
}
