package redoing9;

public class ShippingCostCalculator {

	public double calculateShippingCost(double weight,double distance) {
		return weight * distance;
	}
	
	public double calculateShippingCost(double weight, double distance, boolean priority) {
		if(priority==true) {
			return weight * distance * 10;
		}
		else {
			return calculateShippingCost(weight, distance);
		}
	}
	
	public double calculateShippingCost(double weight, double distance, boolean priority, String typeOfPackage) {
		//Package package = packageType(typeOfPackage);
		return 0.0;
	}
	
//	private Package packageType(String typeOfPackage) {
//		if(typeOfPackage.equalsIgnoreCase("Standard")) {
//			return new StandardPackage();
//		}
//		else if(typeOfPackage.equalsIgnoreCase("Express")) {
//			return new ExpressPackage();
//		}
//		else if(typeOfPackage.equalsIgnoreCase("International")) {
//			return new InternationalPackage();
//		}
	}
