package travelbookingsystem2;

public class FlightBooking extends Booking {
	public FlightBooking(double cost) {
		super(cost);
	}
	@Override
	public double getCost() {
		return cost;
	}

}
