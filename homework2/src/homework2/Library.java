package homework2;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	private List<Book> books;
	private List<Reader> readers;
	private List<BorrowingRecord> borrowingRecords;
	
	// constructor
	public Library() {
		this.books = new ArrayList<>();
		this.readers = new ArrayList<>();
		this.borrowingRecords = new ArrayList<>();
	}
	
	// getter and setter (it's not necessary to have getter and setter
	
	
	// method
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	public void registerReader(Reader reader) {
		readers.add(reader);
	}
	
	public void unregisterReader(Reader reader) {
		readers.remove(reader);
	}
	
	public void borrowBook(Book book, Reader reader) {
		if (book.getAvailableQuantity() > 0 && reader.canBorrow()) {
			book.decreaseQuantity();
			BorrowingRecord borrowingRecord = new BorrowingRecord(book, reader, new Date());
			borrowingRecords.add(borrowingRecord);
			reader.addBorrowingRecord(borrowingRecord);
		}
	}
	
	public void returnBook(Book book, Reader reader) {
		BorrowingRecord record = borrowingRecords.stream().filter(r -> r.getBook().equals(book) && r.getReader().equals(reader) && r.getReturnDate() == null).findFirst().orElse(null);
		
		if (record != null) {
			book.increaseQuantity();
			record.setReturnDate(new Date());
			reader.removeBorrowingRecord(record);
		}
	}
	
	public List<BorrowingRecord> getBorrowingRecord(Reader reader){
		return borrowingRecords.stream().filter(record -> record.getReader().equals(reader)).collect(Collectors.toList());
	}
}
