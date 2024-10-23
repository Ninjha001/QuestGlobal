package onlinefoodorder;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		System.out.println();
		System.out.print("Enter the items (name,quantity) to be ordered. Type 'over' when finished: ");
		 while (true) {
	            String input = scanner.nextLine();
	            if (input.equalsIgnoreCase("over")) {
	                break;
	            }
	            String[] parts = input.split(",");
	            String name = parts[0].trim();
	            int quantity = Integer.parseInt(parts[1].trim());

	            MenuItem menuItem;
	            if (name.equalsIgnoreCase("food")) {
	                menuItem = new FoodItem();
	            } else if (name.equalsIgnoreCase("beverage")) {
	                menuItem = new BeverageItem();
	            } else {
	                menuItem = new DessertItem();
	            }
	            OrderItem orderItem = new OrderItem(menuItem, quantity);
	            orderItems.add(orderItem);
	        }
		
		System.out.print("Enter discount code (or leave blank): ");
        String discountCode = scanner.nextLine().trim();

        System.out.print("Enter tax rate (as a decimal, e.g., 0.05 for 5%): ");
        double taxRate = Double.parseDouble(scanner.nextLine().trim());

        double totalCost;
        if (!discountCode.isEmpty()) {
            if (taxRate > 0) {
                totalCost = OrderCalculator.calculateTotalCost(orderItems, discountCode, taxRate);
            } else {
                totalCost = OrderCalculator.calculateTotalCost(orderItems, discountCode);
            }
        } else {
            totalCost = OrderCalculator.calculateTotalCost(orderItems);
        }

        System.out.println("\nOrder Summary:");
        for (OrderItem orderItem : orderItems) {
            System.out.printf("%s (Quantity: %d) - Price: $%.2f each%n",
                    orderItem.getMenuItem().getClass().getSimpleName(),
                    orderItem.getQuantity(),
                    orderItem.getMenuItem().getPrice());
        }
        System.out.printf("Total Cost: $%.2f%n", totalCost);
	
		scanner.close();
	}

}
