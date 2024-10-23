package multimedialibrarysystem;

public class Music extends MediaContent {
	
	private static final double Rental_Rate_Per_Day = 1500.0;
	
	public Music(String title, String description) {
		super(title, description);
	}
	
	public double calculateRentalCost(int days) {
		System.out.println("Rental Rate Per Day: $"+Rental_Rate_Per_Day);
		return days * Rental_Rate_Per_Day;
	}

}
