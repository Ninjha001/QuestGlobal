package onlinebookstore;
import java.util.HashMap;
import java.util.Map;
public class Store {
	private Map<String, Book> books;

	public Store() {
		this.books = new HashMap<String, Book>();
	}
	
	public void addBook(Book b) {
		books.put(b.getISBN(), b);
	}
	
	public Book searchBookByTitle(String title) throws BookNotFoundException, OutOfStockException {
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.getQuantity() == 0) {
                    throw new OutOfStockException(book.getTitle() + " is out of stock.");
                }
                return book; 
            }
        }
        throw new BookNotFoundException(title + " not found in store.");
    }
	
}
