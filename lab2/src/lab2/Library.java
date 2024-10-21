package lab2;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}
}
