package movietheatre;

public class SeniorCustomer extends Customer {

	@Override
	double getDiscount() {
		return 0.20;
	}
	
	 @Override
	    public double getTicketPrice(String movieType) {
	        if (movieType.equalsIgnoreCase("3D")) {
	            return 12.00; 
	        } else {
	            return 8.00; 
	        }
	    }

}
