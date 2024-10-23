package inventory;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Inventory inventory = new Inventory();
		
		while(true) {
			System.out.println();
			System.out.println("Welcome to the Inventory Management System");
			System.out.println("1. Add item");
			System.out.println("2. Remove item");
			System.out.println("3. Check availability");
			System.out.println("4. Exit");
			
			System.out.println("Enter the option (1/2/3/4): ");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1: 
				System.out.println("Enter the item name: ");
				String itemName = scanner.nextLine();
				System.out.println("Enter the quantity of the item: ");
				int quantity = scanner.nextInt();
				System.out.println("Enter the price of one item: ");
				double price = scanner.nextDouble();
				scanner.nextLine();
				inventory.addItem(new Item(itemName,quantity,price));
				break;
			case 2:
				try{
					System.out.println("Enter the item name to be removed: ");
					String removeName = scanner.nextLine();
					System.out.println("Enter the quantity of the item to be removed: ");
					int removeQuantity = scanner.nextInt();
					inventory.removeItem(removeName,removeQuantity);
				}
				catch(ItemNotFoundException | ItemOutOfStockException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Enter the item name to be checked: ");
					String checkName = scanner.nextLine();
					inventory.checkAvailability(checkName);
				}
				catch(ItemNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Exiting program...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Enter a valid option");
			}
		}
	}

}
