import model.Book;
import service.LibraryManager;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book("B002", "1984", "George Orwell"),
                new Book("B003", "To Kill a Mockingbird", "Harper Lee"),
                new Book("B004", "The Catcher in the Rye", "J.D. Salinger"),
                new Book("B005", "The Hobbit", "J.R.R. Tolkien")
        };

        // Sort the books by title for binary search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        LibraryManager manager = new LibraryManager(books);

        // Linear Search
        System.out.println("Linear Search:");
        Book book = manager.linearSearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found.");

        // Binary Search
        System.out.println("\nBinary Search:");
        book = manager.binarySearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found.");
    }
}