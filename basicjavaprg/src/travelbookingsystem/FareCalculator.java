package travelbookingsystem;

public class FareCalculator {
	public static double calculateFare(double distance, String travelMode) {
		Travel travel = getTravelInstance(travelMode);
		double farePerKm = travel.getBaseFarePerKm();
		/*
		 * System.out.println("Travel Mode: "+travelMode);
		 * System.out.println("Base Fare Per Km: $ "+farePerKm);
		 */
		return distance * farePerKm;
	}

	public static double calculateFare(double distance, String travelMode, double discount) {
		Travel travel = getTravelInstance(travelMode);
		double farePerKm = travel.getBaseFarePerKm();
		double totalFare = distance * farePerKm;
		/*
		 * System.out.println("Travel Mode: "+travelMode);
		 * System.out.println("Base Fare Per Km: $ "+farePerKm);
		 * System.out.println("Discount: "+discount+"%");
		 */
		return totalFare - (totalFare * (discount / 100));
	}

	public static double calculateFare(double distance, Passenger passenger, String travelMode) {
		Travel travel = getTravelInstance(travelMode);
		double farePerKm = travel.getBaseFarePerKm();
		double totalFare = distance * farePerKm;
		/*
		 * System.out.println("Travel Mode: "+travelMode);
		 * System.out.println("Base Fare Per Km: $ "+farePerKm);
		 * System.out.println("Passenger type: "+passenger);
		 * System.out.println("Discount: "+passenger.getDiscount());
		 */
		return totalFare - (totalFare * (passenger.getDiscount() / 100));
	}

	private static Travel getTravelInstance(String travelMode) {
		if (travelMode.equalsIgnoreCase("Bus")) {
			return new BusTravel();
		} else if (travelMode.equalsIgnoreCase("Train")) {
			return new TrainTravel();
		} else if (travelMode.equalsIgnoreCase("Flight")) {
			return new FlightTravel();
		} else {
			throw new IllegalArgumentException("Invalid travel mode");
		}
	}
}