package redoing8;

public abstract class Customer {
	private int noOfTickets;
	private double price;
	private static double rate2D = 30;
	private static double rate3D = 40;
	
	public Customer(int noOfTickets, double price) {
		this.noOfTickets = noOfTickets;
		this.price = price;
	}

	public abstract double getDiscount();
	
	public double calculateTotalCost(int noOfTickets,double price) {
		return noOfTickets * price;
	}
	
	public double calculateTotalCost(Customer type, int noOfTickets,double price,String ticketType) {
		double discount = type.getDiscount();
		double totalCost = 0.0;
		double baseCost = calculateTotalCost(noOfTickets, price);
		if(ticketType.equalsIgnoreCase("2D")) {
			totalCost =  baseCost - (baseCost * discount) + rate2D;
		}
		else if(ticketType.equalsIgnoreCase("3D")) {
			totalCost = baseCost + (baseCost * discount) + rate3D;
		}
		return totalCost;
	}
	
	
}
