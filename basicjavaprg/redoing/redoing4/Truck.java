package redoing4;

public class Truck extends Vehicle {
	private int loadCapacity;
	Truck(String vehicleId,String brand,String model,double baseRent,int loadCapacity){
		super(vehicleId,brand,model,baseRent);
		this.loadCapacity = loadCapacity;
	}
	@Override
	public double calculateRent(int days) {
		double rent = baseRent * days * (loadCapacity > 200?1.2:1.0);
		System.out.println("TOTAL RENT FOR " + days + " days: $" + rent);
		return rent;
	}

}
