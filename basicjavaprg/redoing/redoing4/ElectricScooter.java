package redoing4;

public class ElectricScooter implements Rentable {
	private String scooterId;
	private String brand;
	private int batteryCapacity;
	private double baseRent;
	
	ElectricScooter(String scooterId,String brand,int batteryCapacity,double baseRent){
		this.baseRent = baseRent;
		this.batteryCapacity = batteryCapacity;
		this.brand = brand;
		this.scooterId = scooterId;
	}
	@Override
	public double calculateRent(int days) {
		double rent = baseRent * days * (batteryCapacity > 20 ? 1.3 : 1.0);
		System.out.println("TOTAL RENT FOR " + days + " days: $" + rent);
		return rent;
	}

	@Override
	public void displayDetails() {
		System.out.println("SCOOTER ID: " + scooterId);
		System.out.println("BRAND NAME: " + brand);
		System.out.println("BATTERY CAPACITY (in kwhs): " + batteryCapacity);
		System.out.println("BASE RENT: $" + baseRent);
	}

}
