package travelbookingsystem2;

public class RentalCarBooking extends Booking {
	public RentalCarBooking(double cost) {
		super(cost);
	}
	@Override
	public double getCost() {
		return cost;
	}

}
