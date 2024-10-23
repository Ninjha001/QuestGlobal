package redoing4;

public class Bike extends Vehicle {
	private int engineCapacity;
	
	Bike(String vehicleId,String brand,String model,double baseRent,int engineCapacity){
		super(vehicleId,brand,model,baseRent);
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	public double calculateRent(int days) {
		double rent = baseRent * days * (engineCapacity>150?1.2:1.0);
		System.out.println("TOTAL RENT FOR " + days + " days: $" + rent);
		return rent;
	}

}
