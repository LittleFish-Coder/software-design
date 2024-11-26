package midterm;

import java.util.Date;

//Main booking class handling reservation logic
public class Booking {
	private String bookingId;
	private Account account;
	private Room room;
	private Date checkInDate;
	private Date checkOutDate;
	private double totalAmount;
	private BookingStatus status;
	private List<UtilityService> utilities;

	public Booking(Account account, Room room, Date checkIn, Date checkOut) {
		// Constructor
		}

	public void confirmBooking();
	public void cancelBooking();
	public double calculateTotalCharges();
	public void addUtilityService(UtilityService service);
	public void sendConfirmationNotification();
}