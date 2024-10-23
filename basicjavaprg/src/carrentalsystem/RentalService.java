package carrentalsystem;

public class RentalService {
	public double calculateRentalCost(int duration,double baseRate) {
		return duration * baseRate;
	}
	
	public double calculateRentalCost(int duration,double baseRate,String feature) {
		double additionalFeatureCharge = 0.00;
		if(feature.equalsIgnoreCase("GPS")) {
			additionalFeatureCharge = 5.00;
			return (duration * baseRate) + additionalFeatureCharge;
		}else if(feature.equalsIgnoreCase("Child Seat")) {
			additionalFeatureCharge = 10.00;
			return (duration * baseRate) + additionalFeatureCharge;
		}
		else {
			System.out.println("Invalid feature.");
			return 0.00;
		}
		
	}
	
	public double calculateRentalCost(int duration,double baseRate,String feature,Vehicle vehicleType) {
		double vehicleRate = vehicleType.getRentalRate();
		double totalCost = calculateRentalCost(duration, vehicleRate, feature);
		return totalCost;
	}
	
	public double getAdditionalFeatureCharge(String feature) {
        if (feature.equalsIgnoreCase("GPS")) {
            return 5.0; 
        } else if (feature.equalsIgnoreCase("ChildSeat")) {
            return 10.0; 
        }
        return 0.0;
    }
}
