package midterm;

//Represents a user account in the system
public class Account {
	private String accountId;
	private String username;
	private String password;
	private String email;
	private UserProfile userProfile;
	
	public Account(String username, String password, String email) {
		// Constructor
	}

	public void login();
	public void logout();
	public void register();
	public void updateProfile();
	public List<Booking> getBookingHistory();
}