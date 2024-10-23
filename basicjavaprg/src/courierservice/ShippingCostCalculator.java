package courierservice;

public class ShippingCostCalculator {
	
	public double shippingCostCalculator(double weight,double distance) {
		double baseCost = weight*0.5+distance*0.2;
		System.out.println("WEIGHT(in kgs): "+weight);
		System.out.println("DISTANCE(in kms): "+distance);
		System.out.println("BASECOST: $"+baseCost);
		return baseCost;
	}
	
	public double shippingCostCalculator(double weight,double distance,boolean priority) {
		double baseCost = shippingCostCalculator(weight, distance);
		if(priority==true) {
			double prioritySurCharge = 100.00;
			baseCost += prioritySurCharge;
			System.out.println("PRIORITY SURCHARGE: $"+prioritySurCharge);
			System.out.println("NEW COST: $"+baseCost);
			return baseCost;
		}else {
			System.out.println("BASE COST: $"+baseCost);
			return baseCost;
		}
	}
	
	public double shippingCostCalculator(double weight,double distance,boolean priority,String packageType) {	
		double baseCost = shippingCostCalculator(weight, distance, priority);
		double packageSurCharge = 0.00;
		switch (packageType.toLowerCase()){
		case "standard": 
			packageSurCharge = 200.00;
			break;
		case "express":
			packageSurCharge = 400.00;
			break;
		case "international":
			packageSurCharge = 800.00;
			break;
		default:
			System.out.println("Invalid package type.");
			break;
		}
		
		if(packageSurCharge>0) {
			System.out.println("The corresponding package is "+packageType.toUpperCase()+" and the package surcharge is "+packageSurCharge);
			baseCost += packageSurCharge;
		}
		return baseCost;
	}
}
