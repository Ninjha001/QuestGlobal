package travelbookingsystem2;

public abstract class Booking {
	protected double cost;
	Booking(double cost){
		this.cost = cost;
	}
	public abstract double getCost();
}
