import java.io.Serializable;


public class Login implements Serializable
{
	String userID;
	transient String passWord;
	
	public Login(String userID, String passWord) {
		super();
		this.userID = userID;
		this.passWord = passWord;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Login [userID=" + userID + ", passWord=" + passWord + "]";
	}
}
