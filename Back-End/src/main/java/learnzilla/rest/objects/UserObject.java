package learnzilla.rest.objects;

public class UserObject {
	
	private int userID;
	private String username;
	private boolean isOnline;
	private int fettigkeitsgrad;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public int getFettigkeitsgrad() {
		return fettigkeitsgrad;
	}
	public void setFettigkeitsgrad(int fettigkeitsgrad) {
		this.fettigkeitsgrad = fettigkeitsgrad;
	}

}
