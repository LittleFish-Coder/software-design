package midterm;

//Helper class to manage time slots for room bookings
public class TimeSlot {
	private Date startTime;
	private Date endTime;
	public TimeSlot(Date startTime, Date endTime) {
		// Constructor
	}

	public boolean overlaps(TimeSlot other);
}