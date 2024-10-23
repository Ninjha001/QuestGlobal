package vehiclerentalsystem;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		System.out.println();
		Car c = new Car("CAR", "Land Rover", "4x4", 10,true);
		Bike b = new Bike("BIKE", "Harley Davidson", "Cruiser", 30,150);
		Truck  t = new Truck("TRUCK", "Bharat Benz", "AIP", 8,5);
		ElectricScooter es = new ElectricScooter("ELECTRIC SCOOTER", "Aather", 3000, 20);
		
		ArrayList<Rentable> rentables = new ArrayList<>();
		rentables.add(c);
		rentables.add(b);
		rentables.add(t);
		rentables.add(es);
		
		for(Rentable rent : rentables) {
			if(rent instanceof Vehicle) {
				Vehicle v = (Vehicle) rent;
				v.displayDetails();
				v.calculateRent(30);			
			}else if(rent instanceof ElectricScooter) {
				ElectricScooter v = (ElectricScooter) rent;
				v.displayDetails();
				v.calculateRent(10);
			}
		}
		
	}

}
