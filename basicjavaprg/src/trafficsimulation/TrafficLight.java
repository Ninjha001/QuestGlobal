package trafficsimulation;

public class TrafficLight {
	private String color;
	private int timer;

	public TrafficLight(String initialColor,int timer) {
		this.color = initialColor;
		this.timer = timer;
	}
	public void changeColor() {
		switch(color) {
		case "red":
			color = "green";
			break;
		case "green":
			color =  "yellow";
			break;
		case "yellow":
			color = "red";
			break;
		}
	}
	public String getColor() {
		return color;
	}
	public int getTimer() {
		return timer;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setTimer(int timer) {
		this.timer = timer;
	}
	
	public String toString() {
		return "Traffic Light is " + color;
	}
}
