package support.test.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import support.test.one.database.DatabaseClass;
import support.test.one.model.Message;
import support.test.one.model.Profile;

/**
 * This keeps every {@link Message} created in the system and provides them 
 * on as requested {@link #getMessages()}
 * */
public class MessageService {

	private static List<Message> messages;
	
	private Map<Long, Message> messages_map = DatabaseClass.getMessages(); 
	private Map<Long, Profile> profiles_map = DatabaseClass.getProfiles(); 
	
	static{
		messages = new ArrayList<Message>();
		messages.add(new Message(1L, "First message", "Panakj"));
		messages.add(new Message(1L, "Second message", "Panakj"));
	}

	public static List<Message> getMessages() {
		return messages;
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages_map.values());
	}

	public Message getMessage(long id){
		return messages_map.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages_map.size()+1);
		messages_map.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if (message.getId() <= 0) {
			return null;
		}
		messages_map.put(message.getId(), message);
		return message;
	}
	
	public Message deleteMessage(Long id){
		if (id <= 0) {
			return null;
		}
		return messages_map.remove(id);
	}
}
