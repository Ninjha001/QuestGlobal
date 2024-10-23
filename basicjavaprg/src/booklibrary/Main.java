package booklibrary;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Library l = new Library();
		Scanner scanner = new Scanner(System.in);
		while(true) {	
			System.out.println();
			System.out.println("Welcome to the Library!!");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Search Book");
			System.out.println("4. Exit");
			
			System.out.println();
			System.out.println("Enter the option (1/2/3/4): ");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1:
				System.out.println("Enter the ISBN of Book: ");
				int ISBN = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter the title: ");
				String title = scanner.nextLine();
				System.out.println("Enter the author: ");
				String author = scanner.nextLine();
				l.addBook(new Book(title,author,ISBN));
				break;
			case 2:
				try {
					System.out.println("Enter the title of the book to be removed: ");
					String removeTitle = scanner.nextLine();
					l.removeBook(removeTitle);
				}
				catch(EmptyLibraryException | BookNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Enter the title of the book to be searched: ");
					String searchTitle = scanner.nextLine();
					l.searchBook(searchTitle);
				}
				catch(BookNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Exiting the program...");
				scanner.close();
				System.exit(0);
			default :
				System.out.println("Invalid option. Try again");
				
			}
		}
	}
}
