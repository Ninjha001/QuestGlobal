package redoing8;

public class AdultCustomer extends Customer {

	public AdultCustomer(int noOfTickets, double price) {
		super(noOfTickets, price);
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
