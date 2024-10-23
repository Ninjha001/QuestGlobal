package redoing4;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("C45367", "LAND ROVER", "4x4", 10, true);
		Bike bike = new Bike("B8937", "HARLEY DAVIDSON", "CRUISER", 30, 150);
		Truck truck = new Truck("T896", "BHARAT BENZ", "AIP", 8, 5);
		ElectricScooter eScooter = new ElectricScooter("E79865", "ATHER", 3000, 20);
		
		ArrayList<Rentable> rentables = new ArrayList<>();
		rentables.add(car);
		rentables.add(bike);
		rentables.add(truck);
		rentables.add(eScooter);
		
		for(Rentable items : rentables) {
			if(items instanceof Vehicle) {
				Vehicle vehicle = (Vehicle) items;
				System.out.println();
				vehicle.displayDetails();
				vehicle.calculateRent(7);
			}else if(items instanceof ElectricScooter) {
				ElectricScooter scooter = (ElectricScooter) items;
				System.out.println();
				scooter.displayDetails();
				scooter.calculateRent(12);
			}
		}
	}
	
}
