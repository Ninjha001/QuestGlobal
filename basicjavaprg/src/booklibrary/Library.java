package booklibrary;
import java.util.ArrayList;
import java.util.Iterator;
public class Library {
	private ArrayList<Book> books;
	
	public Library(){
		this.books = new ArrayList<Book>();
	}
	
	public void addBook(Book b) {
		books.add(b);
		System.out.println("Successfully added");
	}
	
	public void removeBook(String title) throws EmptyLibraryException,BookNotFoundException {
		try {
			if(books.isEmpty()) {
				throw new EmptyLibraryException("The library is currently empty");
			}
		}
		catch(EmptyLibraryException e) {
			System.out.println(e.getMessage());
		}
		
		Iterator<Book> iterator = books.iterator();
		boolean flag = false;
		while(iterator.hasNext()) {
			Book book = iterator.next();
			try {
				if(book.getTitle().equalsIgnoreCase(title)) {
					iterator.remove();
					System.out.println("Book removed successfully");
					flag=true;
					break;
				}
				if(!flag){
					throw new BookNotFoundException("Requested Book cannot be found in the Library");
				}
			}
			catch(BookNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}
		
		public void searchBook(String title) throws BookNotFoundException{
			for(Book book : books) {
				try {
					if(book.getTitle().equalsIgnoreCase(title)) {
						System.out.println("Match Found");
						System.out.println(book.getISBN()+" || "+book.getTitle()+" || "+book.getAuthor());
					}
					else {
						throw new BookNotFoundException("Requested Book cannot be found in the Library");
					}
				}
				catch(BookNotFoundException e) {
					System.out.println(e.getMessage());
				}
			}
		}
}