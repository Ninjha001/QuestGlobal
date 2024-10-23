package com.travelbooking.www;

public class FareCalculator {
	public double calculateFare(double kilometers, double baseFarePerKm) {
		System.out.println("Base Cost: $"+(kilometers*baseFarePerKm));
		return kilometers * baseFarePerKm;
	}
	
	public double calculateFare(double kilometers, double baseFarePerKm, double discount) {
		double baseFare = calculateFare(kilometers, baseFarePerKm);
		double discountFare = baseFare * (discount/100);
		System.out.println("Discount Fare: $" +discountFare);
		return baseFare - discountFare;
	}
	
	public double calculateFare(double kilometers, double baseFarePerKm, double discount, String travelMode) {
		Travel travel = findTravelMode(travelMode);
		double baseFare = calculateFare(kilometers, baseFarePerKm, discount);
		double baseRate = travel.getBaseFarePerKm();
		System.out.println("Base Fare after Discount: " + baseFare);
		System.out.println("BaseRate : $"+baseRate);
		return baseFare * baseRate;
	}
	
	private Travel findTravelMode(String travelMode) {
		if(travelMode.equalsIgnoreCase("bus"))
			return new Bus();
		else if(travelMode.equalsIgnoreCase("train"))
			return new Train();
		else if(travelMode.equalsIgnoreCase("flight"))
			return new Flight();
		else {
			System.out.println("Invalid travel mode.Defaulting to Bus");
			return new Bus();	
		}	
	}
}
