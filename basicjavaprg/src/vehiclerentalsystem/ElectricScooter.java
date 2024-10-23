package vehiclerentalsystem;

public class ElectricScooter implements Rentable {

	private String scooterId;
	private String brand;
	private int batteryCapacity;
	private double baseRent;
	
	public ElectricScooter(String scooterId, String brand, int batteryCapacity, double baseRent) {
		super();
		this.scooterId = scooterId;
		this.brand = brand;
		this.batteryCapacity = batteryCapacity;
		this.baseRent = baseRent;
	}
	
	public double calculateRent(int days) {
		double rent = days * baseRent * (batteryCapacity > 20 ? 1.3 : 1.0);
		System.out.println("Base Rent of Electric Scooter: "+rent);
		return 0;
	}

	public void displayDetails() {
		System.out.println("Scooter ID: "+scooterId);
		System.out.println("Scooter Brand: "+brand);
		System.out.println("Scooter Battery Capacity: "+batteryCapacity);
		System.out.println("Scooter Base Rent: "+baseRent);
	}

}
