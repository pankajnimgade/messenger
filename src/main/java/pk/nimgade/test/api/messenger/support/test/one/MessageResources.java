package pk.nimgade.test.api.messenger.support.test.one;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import support.test.one.MessageService;
import support.test.one.model.Message;

/**
 * {@link MessageResources} is the class which is used to interact through API's. 
 * This class exposes the API's
 * */
@Path("/messages")
public class MessageResources {
	
	MessageService messageService = new MessageService();

	public MessageResources() {
		// TODO Auto-generated constructor stub
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessages(){
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageID") long messageID){
		return messageService.getMessage(messageID);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message postMessage( Message message){
		return messageService.addMessage(message);
	}

}
