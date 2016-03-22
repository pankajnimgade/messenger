package pk.nimgade.test.api.messenger.support.test.one;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.glassfish.jersey.server.Uri;

@Path("/injectdemo")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class InjectDemoResource {

	public InjectDemoResource() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Path("/annotations")
	public String getMatrixParamsUsingAnnotations(@MatrixParam("someparams") String matrixParams,
			@HeaderParam("customHeaderValue") String myCustomHeader){
		return "annotations are Working: "+ matrixParams+" customHeaderValue: "+myCustomHeader;
	}
	
	@GET
	@Path("/context")
	public String getParamsUsingContext(@Context UriInfo uriInfo){
		return "Context test"+ uriInfo.getAbsolutePath();
	}
	
	

}
