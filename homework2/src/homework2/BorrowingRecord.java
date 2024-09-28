package homework2;

import java.util.Date;

public class BorrowingRecord {
	private Book book;
	private Reader reader;
	private Date borrowDate;
	private Date returnDate;
	
	// constructor
	public BorrowingRecord(Book book, Reader reader, Date borrowDate) {
		this.book = book;
		this.reader = reader;
		this.borrowDate = borrowDate;
		this.returnDate = null;
	}
	
	// getter and setter
	public Book getBook() {
		return this.book;
	}
	
	public Reader getReader() {
		return this.reader;
	}
	
	public Date getBorrowDate() {
		return this.borrowDate;
	}
	
	public Date getReturnDate() {
		return this.returnDate;
	}
	
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
}
