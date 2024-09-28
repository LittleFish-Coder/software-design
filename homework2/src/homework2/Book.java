package homework2;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private int publicationYear;
	private int availableQuantity;
	
	// constructor
	public Book(String title, String author, String isbn, int publicationYear, int availableQuantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.availableQuantity = availableQuantity;
    }
	
	// getter and setter
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	
	// methods
	public void decreaseQuantity() {
		if (availableQuantity > 0) {
			availableQuantity--;
		}
	}
	
	public void increaseQuantity() {
		availableQuantity++;
	}
}
