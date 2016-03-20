package support.test.one;

import java.util.ArrayList;
import java.util.List;

/**
 * This keeps every {@link Message} created in the system and provides them 
 * on as requested {@link #getMessages()}
 * */
public class MessageService {

	private static List<Message> messages;
	
	static{
		messages = new ArrayList<Message>();
		messages.add(new Message(1L, "First message", "Panakj"));
		messages.add(new Message(1L, "Second message", "Panakj"));
	}

	public static List<Message> getMessages() {
		return messages;
	}

	public static void setMessages(List<Message> messages) {
		MessageService.messages = messages;
	}
	

}
