package midterm;

//Room entity with its properties and operations
public abstract class Room {
	private String roomId;
	private String roomType;
	private double pricePerNight;
	private RoomStatus status;
	private List<TimeSlot> bookings;

	public Room(String roomType, double pricePerNight) {
		// Constructor
	}

	public boolean checkAvailability(Date checkIn, Date checkOut);
	public void bookRoom(TimeSlot timeSlot);
	public void changeRoomStatus(RoomStatus status);
}