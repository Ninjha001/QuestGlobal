package onlinefoodorder;
import java.util.List;
public class OrderCalculator {
	public static double calculateTotalCost(List<OrderItem> orderItems) {
		double totalCost = 0.00;
		for(OrderItem orderItem : orderItems) {
			totalCost += orderItem.getMenuItem().getPrice() * orderItem.getQuantity();
		}
		return totalCost;
	}
	
	public static double calculateTotalCost(List<OrderItem> orderItems,String discountCode) {
		double totalCost = calculateTotalCost(orderItems);
		double discount = 0.0;
		if(discountCode.equalsIgnoreCase("SAVE10")) {
			discount = totalCost * 0.1;
		}
		else if(discountCode.equalsIgnoreCase("SAVE20")) {
			 discount = totalCost * 0.2;
		}
		else {
			System.out.println("Invlaid discount code");
		}
		return totalCost-discount;
	}
	
	public static double calculateTotalCost(List<OrderItem> orderItems, String discountCode, double taxRate) {
		double totalCost = calculateTotalCost(orderItems, discountCode);
		double tax = totalCost * taxRate;
		return totalCost + tax;
		
	}
}
