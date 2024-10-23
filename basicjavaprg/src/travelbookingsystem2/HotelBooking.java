package travelbookingsystem2;

public class HotelBooking extends Booking {
	public HotelBooking(double cost) {
		super(cost);
	}
	@Override
	public double getCost() {
		return cost;
	}

}
