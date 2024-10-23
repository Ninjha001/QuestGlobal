package travelbookingsystem2;
import java.util.List;
public class BookingCalculator {
	public double calculateTotalCost(List<Booking> bookings) {
		double total=0.0;
		for(Booking booking : bookings) {
			total =+ booking.getCost();
		}
		return total;
	}
	
	public double calculateTotalCost(List<Booking> bookings,String discountCode) {
		double total = calculateTotalCost(bookings);
		double discount = getDiscount(discountCode);
		return total - discount;
	}
	
	public double calculateTotalCost(List<Booking> bookings,String discountCode,double taxRate) {
		double total = calculateTotalCost(bookings,discountCode);
		double tax = total * taxRate/100;
		return total + tax;
	}
	
	private double getDiscount(String discountCode) {
		switch(discountCode) {
		case "SAVE10":
			return 10;
		case "SAVE20":
			return 20;
		default:
			return 0;
		}
	}
}
