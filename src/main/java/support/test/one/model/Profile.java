package support.test.one.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	private long id;
	private String profile_Name;
	private String first_Name;
	private String last_Name;
	private Date created;

	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public Profile(long id, String profile_Name, String first_Name, String last_Name) {
		super();
		this.id = id;
		this.profile_Name = profile_Name;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		created = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfile_Name() {
		return profile_Name;
	}

	public void setProfile_Name(String profile_Name) {
		this.profile_Name = profile_Name;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
