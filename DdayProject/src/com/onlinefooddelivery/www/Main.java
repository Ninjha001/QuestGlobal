package com.onlinefooddelivery.www;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BillCalculator bill = new BillCalculator();
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the order amount: ");
		double orderAmount = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter the type of customer(regular/premium/corporate): ");
		String customerType = scanner.nextLine();
		Customer customer = null;
		switch(customerType) {
		case "regular":
			customer = new RegularCustomer();
			break;
		case "premium":
			customer = new PremiumCustomer();
			break;
		case "corporate":
			customer = new CorporateCustomer();
			break;
		default:
			System.out.println("Invalid customer type.Defaulting it to regular");
			customer = new RegularCustomer();
			break;
		}
		double discount = customer.getDiscountRate();
		double finalBillAmount = bill.calculateBill(orderAmount, discount, customer);
		System.out.println("BILL DETAILS");
		System.out.println("------------");
		System.out.println("CUstomer Type: " + customerType);
		System.out.println("Order Amount: $" + orderAmount);
		System.out.println("Discount Rate: " + customer.getDiscountRate());
		System.out.println("Order Amount after Discount: $" + finalBillAmount);
		scanner.close();
	}

}
