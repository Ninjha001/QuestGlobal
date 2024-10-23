package redoing2;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("Malgudi Days", "ID20234", "R K Narayanan", 250);
		Magazine magazine = new Magazine("Times of India", "ID10034", 12, "08-Nov-2023");
		System.out.println();
		System.out.println("Method overriding condition in Book");
		book.getDetails();
		System.out.println();
		System.out.println("Method overloading condition in Book");
		book.getDetails(true);
		System.out.println();
		magazine.getDetails();
		System.out.println();
		magazine.updatePublicationDate("25-Apr-2001");
		System.out.println();
		magazine.getDetails();
	}

}
