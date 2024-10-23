package redoing4;

public abstract class Vehicle implements Rentable {
	private String vehicleId;
	private String brand;
	private String model;
	protected double baseRent;
	
	Vehicle(String vehicleId,String brand,String model,double baseRent){
		this.baseRent=baseRent;
		this.brand=brand;
		this.model=model;
		this.vehicleId=vehicleId;
	}
	
	@Override
	public abstract double calculateRent(int days);

	@Override
	public void displayDetails() {
		System.out.println("VEHICLE ID: " + vehicleId);
		System.out.println("BRAND NAME: " + brand);
		System.out.println("MODEL NAME: " + model);
		System.out.println("BASE RENT: $" + baseRent);
	}

}
