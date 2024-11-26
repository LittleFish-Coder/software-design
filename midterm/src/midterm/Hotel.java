package midterm;

import java.util.List;

//Hotel class managing rooms and bookings
public class Hotel {
	private String hotelId;
	private String name;
	private String location;
	private List<Room> rooms;

	public Hotel(String name, String location) {
		// Constructor
	}

	public List<Room> searchAvailableRooms(Date checkIn, Date checkOut, String roomType);
	public Room getRoomDetails(String roomId);
	public void addRoom(Room room);
}