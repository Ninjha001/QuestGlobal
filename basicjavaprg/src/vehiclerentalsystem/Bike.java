package vehiclerentalsystem;

public class Bike extends Vehicle {
	
	private int engineCapacity;
	
	public Bike(String vehicleId, String brand, String model, double baseRent,int engineCapacity) {
		super(vehicleId, brand, model, baseRent);
		this.engineCapacity = engineCapacity;
	}
	
	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public double calculateRent(int days) {
		double rent = days * baseRent * (engineCapacity > 150 ? 1.1 : 1.0);
		System.out.println("Bike Base Rent: "+rent);
		System.out.println();
		return 0;
	}
	
	
}
