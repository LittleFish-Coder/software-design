package homework2;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Reader {
	private String name;
	private String readerId;
	private Date registrationDate;
	private String phoneNumber;
	private List<BorrowingRecord> currentBorrowings = new ArrayList<>();
	
	// constructor
	public Reader(String name, String readerId, String phoneNumber) {
		this.name = name;
		this.readerId = readerId;
		this.registrationDate = new Date();
		this.phoneNumber = phoneNumber;
		this.currentBorrowings = new ArrayList<>();
	}
	
	// getter and setter
	public String getName() {
		return name;
	}
	
	public String getReaderId() {
		return readerId;
	}
	
	public Date getRegistrationDate() {
		return registrationDate;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// methods
	public boolean canBorrow() {
		return currentBorrowings.size() < 3;
	}
	
	public void addBorrowingRecord(BorrowingRecord record) {
		currentBorrowings.add(record);
	}
	
	public void removeBorrowingRecord(BorrowingRecord record) {
		currentBorrowings.remove(record);
	}
	
}
