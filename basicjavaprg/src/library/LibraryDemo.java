package library;

public class LibraryDemo {

	public static void main(String[] args) {
		Book book = new Book("Atomic Habits","B23","James Clear",200);
		Magazine magazine = new Magazine("TimesofIndia","Issue24",24,"July 23, 2024");
		book.getDetails();
		book.getDetails(true);
		//book.getDetails(false);
		magazine.getDetails();
		magazine.updatePublicationDate("April 25, 2001");
		magazine.getDetails();
	}

}
