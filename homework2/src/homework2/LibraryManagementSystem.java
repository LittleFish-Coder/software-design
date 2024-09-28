package homework2;

import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library();

        // Add some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925, 5);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789", 1960, 3);
        library.addBook(book1);
        library.addBook(book2);

        // Register some readers
        Reader reader1 = new Reader("Alice Smith", "R001", "123-456-7890");
        Reader reader2 = new Reader("Bob Johnson", "R002", "098-765-4321");
        library.registerReader(reader1);
        library.registerReader(reader2);

        // Test borrowing and returning books
        System.out.println("Testing book borrowing and returning:");
        library.borrowBook(book1, reader1);
        library.borrowBook(book2, reader1);
        library.borrowBook(book1, reader2);

        System.out.println("Books available after borrowing:");
        System.out.println(book1.getTitle() + ": " + book1.getAvailableQuantity());
        System.out.println(book2.getTitle() + ": " + book2.getAvailableQuantity());

        library.returnBook(book1, reader1);

        System.out.println("Books available after returning:");
        System.out.println(book1.getTitle() + ": " + book1.getAvailableQuantity());
        System.out.println(book2.getTitle() + ": " + book2.getAvailableQuantity());

        // Test borrowing history
        System.out.println("\nBorrowing history for " + reader1.getName() + ":");
        List<BorrowingRecord> history = library.getBorrowingRecord(reader1);
        for (BorrowingRecord record : history) {
            System.out.println("Book: " + record.getBook().getTitle() +
                               ", Borrowed: " + record.getBorrowDate() +
                               ", Returned: " + (record.getReturnDate() != null ? record.getReturnDate() : "Not yet returned"));
        }
    }
}