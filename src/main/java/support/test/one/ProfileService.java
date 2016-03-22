package support.test.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import support.test.one.database.DatabaseClass;
import support.test.one.model.Message;
import support.test.one.model.Profile;

/**
 * This keeps every {@link Profile} created in the system and provides them 
 * on as requested {@link #getAllMessages()}
 * */
public class ProfileService {

	private Map<String, Profile> profiles_map = DatabaseClass.getProfiles();

	public ProfileService() {
		// TODO Auto-generated constructor stub
	}

	public List<Profile> getAllMessages() {
		return new ArrayList<Profile>(profiles_map.values());
	}

	public Profile getProfile(String profile) {
		return profiles_map.get(profile);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles_map.size() + 1);
		profiles_map.put(profile.getProfile_Name(), profile);
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfile_Name().isEmpty()) {
			return null;
		}
		profiles_map.put(profile.getProfile_Name(), profile);
		return profile;
	}

	public Profile deleteProfile(String profile) {
		return profiles_map.remove(profile);
	}

}
