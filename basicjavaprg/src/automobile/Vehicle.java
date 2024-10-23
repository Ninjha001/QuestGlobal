package automobile;

public abstract class Vehicle {
	public int noOfWheels;
	public String color;
	
	Vehicle(int noOfWheels,String color){
		this.noOfWheels = noOfWheels;
		this.color = color;
	}
	
	//abstract void speed();
	
	void speed() {
		System.out.println("The vehicle runs high speed");
	}
	void fuelConsumed() {
		System.out.println("The vehicle runs on fossil fuels");
	}
}
