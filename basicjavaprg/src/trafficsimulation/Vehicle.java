package trafficsimulation;

public class Vehicle {
	private String type;
	private int speed;
	private int position;
	
	public Vehicle(String type, int speed, int position) {
		this.type = type;
		this.speed = speed;
		this.position = position;
	}
	
	public int accelerate(int increment) {
		speed+=increment;
		return speed;
	}
	
	public int decelerate(int decrement) {
		speed-=decrement;
		if(speed<=0) {
			return speed;
		}
		return speed;
	}
	
	public void move() {
		position+=speed;
	}

	public String getType() {
		return type;
	}

	public int getSpeed() {
		return speed;
	}

	public int getPosition() {
		return position;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public String toString() {
		return type + " at position " + position + " with speed " + speed + ".";
	}
}
