package carrentalsystem2;

public class RentalCostCalculator {
	public double calculateRentalCost(String carType,int duration) {
		Car car = getCarInstance(carType);
		double farePerKm = car.getBaseRatePerDay();
		return farePerKm * duration;
	}
	
	public double calculateRentalCost(String carType, int duration, boolean isInsuranceIncluded) {
		double baseCost = calculateRentalCost(carType, duration);
		if(isInsuranceIncluded) {
			double insuranceCost = 20.0 * duration;
			return baseCost + insuranceCost;
		}
		else {
			return baseCost;
		}
	}
	
	public double calculateRentalCost(String carType, int duration,boolean isInsuranceIncluded, String[] additionalFeature) {
		double baseCost = calculateRentalCost(carType, duration,isInsuranceIncluded);
		double featureCost = calculateFeatureCost(additionalFeature);
		return baseCost + featureCost;
	}
	
	
	
	private static Car getCarInstance(String carType) {
		if(carType.equalsIgnoreCase("EconomyCar")) {
			return new EconomyCar();
		}
		else if(carType.equalsIgnoreCase("MidsizeCar")) {
			return new MidsizeCar();
		}
		else if(carType.equalsIgnoreCase("LuxuryCar")) {
			return new LuxuryCar();
		}
		else {
			throw new IllegalArgumentException("Invalid car type");
		}
	}
	
	private double calculateFeatureCost(String[] additionalFeatures) {
	    double additionalFeatureCost = 0.0;
	    
	    for (String features : additionalFeatures) {
	        String feature = features.toLowerCase().trim();
	       
	        if (feature.equals("gps")) {
	            additionalFeatureCost += 10.0;
	        } else if (feature.equals("childseat")) {
	            additionalFeatureCost += 15.0;
	        } else if (feature.equals("additionaldriver")) {
	            additionalFeatureCost += 20.0;
	        }else {
	        	break;
	        }
	    }
	    
	    return additionalFeatureCost;
	}
	
}
