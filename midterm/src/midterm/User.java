package midterm;

public class User {
    private String userID;
    private String name;
    private String contactDetails;

    // Constructor
    public User(String userID, String name, String contactDetails) {
        this.userID = userID;
        this.name = name;
        this.contactDetails = contactDetails;
    }

    // Operations
    public void updateContactDetails() {
        // Logic to update user contact details
    }

    public void viewBookingHistory() {
        // Logic to view booking history
    }

    public void cancelBooking(Booking booking) {
        // Logic to cancel a booking
    }

    // Getters and setters
}
