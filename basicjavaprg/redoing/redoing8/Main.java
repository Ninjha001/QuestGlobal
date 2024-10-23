package redoing8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Customer customer;
		Scanner scanner = new Scanner(System.in);
		double totalCost = 0.0;
		System.out.println("Enter the total number of tickets: ");
		int totalNoOfTickets = scanner.nextInt();
		while(totalNoOfTickets!=0) {
			System.out.println("Enter the type of customer(child/adult/senior): ");
			String customerType = scanner.next();
			System.out.println("Enter the number of tickets: ");
			int noOfTickets = scanner.nextInt();
			System.out.println("Enter the type of movie(2D/3D): ");
			String movieType = scanner.next();
			double price;
			if(customerType.equalsIgnoreCase("child")) {
				System.out.println("Enter the price for one ticket: ");
				price = scanner.nextDouble();
				customer = new ChildCustomer(noOfTickets,price);
				System.out.println("Cost of "+customerType+" is "+customer.calculateTotalCost(customer, noOfTickets, price, movieType));
				totalCost += customer.calculateTotalCost(customer, noOfTickets, price, movieType);
				totalNoOfTickets-=noOfTickets;
			}
			if(customerType.equalsIgnoreCase("adult")) {
				System.out.println("Enter the price for one ticket: ");
				price = scanner.nextDouble();
				customer = new ChildCustomer(noOfTickets,price);
				System.out.println("Cost of "+customerType+" is "+customer.calculateTotalCost(customer, noOfTickets, price, movieType));
				totalCost += customer.calculateTotalCost(customer, noOfTickets, price, movieType);
				totalNoOfTickets-=noOfTickets;
			}
			if(customerType.equalsIgnoreCase("senior")) {
				System.out.println("Enter the price for one ticket: ");
				price = scanner.nextDouble();
				customer = new ChildCustomer(noOfTickets,price);
				System.out.println("Cost of "+customerType+" is "+customer.calculateTotalCost(customer, noOfTickets, price, movieType));
				totalCost += customer.calculateTotalCost(customer, noOfTickets, price, movieType);
				totalNoOfTickets-=noOfTickets;
			}		
		}
		System.out.println("Total cost is: "+ totalCost);
		scanner.close();
		
	}

}
