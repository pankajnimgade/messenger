package pk.nimgade.test.api.messenger.support.test.one;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResources {

	public CommentResources() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	public String getAllComments(){
		return "get all comment resources";
	}
	
	@GET
	@Path("/{comentID}")
	public String getComment(@PathParam("messageID") long message,@PathParam("comentID") long comentID){
		return "MessageID: "+message+" get comment resources with id: "+comentID;
	}
	

}
