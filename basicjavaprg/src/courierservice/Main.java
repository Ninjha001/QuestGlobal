package courierservice;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ShippingCostCalculator s = new ShippingCostCalculator();
		
		System.out.println();
		System.out.print("Enter the Weight(in kgs): ");
		double weight = scanner.nextDouble();
		System.out.print("Enter the distance(in kms): ");
		double distance = scanner.nextDouble();
		System.out.print("Is the shipment a high priority one or not?  (true/false)? ");
		boolean priority = scanner.nextBoolean();
		System.out.print("Enter the package type: ");
		String packageType = scanner.next();
		
		double totalCost = 0.00;

		totalCost += s.shippingCostCalculator(weight, distance, priority, packageType);
		System.out.println("FINAL SHIPPING COST: $"+totalCost);
		
		Package packObj;
		switch(packageType.toLowerCase()) {
		case "standard":
			packObj = new StandardPackage();
			break;
		case "express":
			packObj = new ExpressPackage();
			break;
		case "international":
			packObj = new InternationalPackage();
			break;
		default:
			System.out.println("Unidentified package type.  Defaulting to Standard package");
			packObj = new StandardPackage();
			break;
		}
		
		int deliveryTime = packObj.getDeliveryTime();
		System.out.println("DELIVERY TIME: "+deliveryTime+" days.");
		
		scanner.close();
	}

}
