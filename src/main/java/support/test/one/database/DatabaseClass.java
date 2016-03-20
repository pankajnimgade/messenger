package support.test.one.database;

import java.util.HashMap;
import java.util.Map;

import support.test.one.model.Message;
import support.test.one.model.Profile;

/**
 * This class acts as Database where it contains Tables {@link Message Messages}
 * and {@link Profile Profiles} which contains respective records
 * */
public class DatabaseClass {
	
	private static Map<Long, Message> messages = new HashMap<Long, Message>(); 
	private static Map<Long, Profile> profiles = new HashMap<Long, Profile>(); 
	
	static{
		messages.put(1L, new Message(1L, "First message", "Panakj"));
		messages.put(2L, new Message(2L, "Second message", "Panakj"));
		
		profiles.put(1L, new Profile(1L, "White", "Sherlock", "Holems"));
		profiles.put(1L, new Profile(2L, "Black", "Dr", "Watson"));
	}

	public DatabaseClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}

}
