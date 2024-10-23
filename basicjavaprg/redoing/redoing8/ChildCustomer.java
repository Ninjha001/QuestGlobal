package redoing8;

public class ChildCustomer extends Customer {
	
	public ChildCustomer(int noOfTickets, double price) {
		super(noOfTickets, price);
	}

	@Override
	public double getDiscount() {
		return 0.50;
	}

}
