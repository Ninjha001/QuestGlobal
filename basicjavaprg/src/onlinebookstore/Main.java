package onlinebookstore;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		
		Store store = new Store();
        Cart cart = new Cart();

        store.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "0395489311", 25, 10));
        store.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "0446310786", 15, 5));
		
		while(true) {
			System.out.println("Welcome to Online Book Store!!");
			System.out.println("1. Search for a Book");
			System.out.println("2. Add Book to Cart");
			System.out.println("3. Place Order");
			System.out.println("4. Exit");
			System.out.println();
			System.out.println("Enter your option (1/2/3/4): ");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1:
				System.out.println("Enter the book title: ");
				String title = scanner.nextLine();
				try{
					store.searchBookByTitle(title);
				}
				catch(BookNotFoundException | OutOfStockException e){
					System.out.println(title + "not found");
				}
				break;
			case 2:
                System.out.print("Enter book title: ");
                String addTitle = scanner.nextLine();
                Book b = new Book(addTitle, null, null, 0, 0);
                try {
                    store.searchBookByTitle(addTitle);
                    cart.addToCart(b);
                    System.out.println("Book added to cart.");
                } catch (BookNotFoundException e) {
                    System.out.println(e.getMessage());
                } catch (OutOfStockException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 3:
                try {
                    System.out.print("Enter shipping address: ");
                    String address = scanner.nextLine();
                    if (!isValidAddress(address)) {
                        throw new InvalidAddressException("Invalid shipping address.");
                    }
                    cart.placeOrder(address);
                    System.out.println("Order placed successfully.");
                } catch (EmptyCartException e) {
                    System.out.println(e.getMessage());
                } catch (InvalidAddressException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 4:
                System.out.println("Exiting program...");
                scanner.close();
                return;

            default:
                System.out.println("Invalid option. Please try again.");
			}
		}
	}
	
	 private static boolean isValidAddress(String address) {
		 String[] parts = address.split(",|\\s+"); 
		    return parts.length >= 4;
	    }

}
