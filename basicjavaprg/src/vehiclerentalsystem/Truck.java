package vehiclerentalsystem;

public class Truck extends Vehicle {
	
	private int loadCapacity;

	public Truck(String vehicleId, String brand, String model, double baseRent,int loadCapacity) {
		super(vehicleId, brand, model, baseRent);
		this.loadCapacity = loadCapacity;
	}
	
	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	public double calculateRent(int days) {
		double rent = days * baseRent * (loadCapacity > 5 ? 1.5 : 1.2);
		System.out.println("Truck Base Rent: "+rent);
		System.out.println();
		return 0;
	}
}
