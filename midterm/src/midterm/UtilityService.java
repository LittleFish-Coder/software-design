package midterm;

//Utility services that can be added to bookings
public abstract class UtilityService {
	private String utilityId;
	private String type;
	private double cost;
	
	public UtilityService(String type, double cost) {
		// Constructor
	}

	public abstract double calculateCharges();
}