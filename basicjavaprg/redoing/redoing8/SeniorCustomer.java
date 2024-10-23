package redoing8;

public class SeniorCustomer extends Customer {

	public SeniorCustomer(int noOfTickets, double price) {
		super(noOfTickets, price);
	}

	@Override
	public double getDiscount() {
		return 0.20;
	}

}
