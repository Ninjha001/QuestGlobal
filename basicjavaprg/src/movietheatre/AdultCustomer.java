package movietheatre;

public class AdultCustomer extends Customer {

	@Override
	double getDiscount() {
		return 0.00;
	}
	
	@Override
    public double getTicketPrice(String movieType) {
        if (movieType.equalsIgnoreCase("3D")) {
            return 15.00; 
        } else {
            return 10.00; 
        }
    }
}
