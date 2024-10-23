package vehiclerentalsystem;

public class Car extends Vehicle {
	private boolean hasAirConditioner;
	
	public boolean isHasAirConditioner() {
		return hasAirConditioner;
	}

	public void setHasAirConditioner(boolean hasAirConditioner) {
		this.hasAirConditioner = hasAirConditioner;
	}

	public Car(String vehicleId, String brand, String model, double baseRent,boolean hasAirConditioner) {
		super(vehicleId, brand, model, baseRent);
		this.hasAirConditioner = hasAirConditioner;
	}
	
	public double calculateRent(int days) {
		double rent = days * baseRent * (hasAirConditioner ? 1.2 : 1.0);
		System.out.println("Car Base Rent: "+rent);
		System.out.println();
		return 0;
	}
}
