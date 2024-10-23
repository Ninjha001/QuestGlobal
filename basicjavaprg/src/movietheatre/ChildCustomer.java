package movietheatre;

public class ChildCustomer extends Customer{

	@Override
	double getDiscount() {
		return 0.50;
	}
	
	 @Override
	    public double getTicketPrice(String movieType) {
	        if (movieType.equalsIgnoreCase("3D")) {
	            return 10.00; 
	        } else {
	            return 5.00; 
	        }
	    }

}
