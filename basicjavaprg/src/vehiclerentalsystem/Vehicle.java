package vehiclerentalsystem;

public abstract class Vehicle implements Rentable{
	public String vehicleId;
	public String brand;
	public String model;
	public double baseRent;
	
	public Vehicle(String vehicleId, String brand, String model, double baseRent) {
		super();
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.model = model;
		this.baseRent = baseRent;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBaseRent() {
		return baseRent;
	}

	public void setBaseRent(double baseRent) {
		this.baseRent = baseRent;
	}
	
	public abstract double calculateRent(int days);
	
	public void displayDetails() {
		System.out.println("Vehicle ID: "+vehicleId);
		System.out.println("Vehicle Brand: "+brand);
		System.out.println("Vehicle Model: "+model);
	}
}
