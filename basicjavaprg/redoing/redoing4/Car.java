package redoing4;

public class Car extends Vehicle {
	private boolean hasAirConditioner;
	
	Car(String vehicleId,String brand,String model,double baseRent,boolean hasAirConditioner){
		super(vehicleId,brand,model,baseRent);
		this.hasAirConditioner = hasAirConditioner;
	}
	@Override
	public double calculateRent(int days) {
		double rent = baseRent * days * (hasAirConditioner?2.0:1.0);
		System.out.println("TOTAL RENT FOR " + days + " days: $" + rent);
		return rent;
	}

}
