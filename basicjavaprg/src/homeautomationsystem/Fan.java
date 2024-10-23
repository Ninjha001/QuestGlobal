package homeautomationsystem;

public class Fan extends SmartDevice {
	private int speed;
	
	Fan(){
		super();
		this.speed = 0;
	}
	
	@Override
	public void operate() {
		System.out.println("Fan is " + (isOn ? "ON" : "OFF")+", Speed: " + speed);
	}
	
	public void setSpeed(int speed) {
        this.speed = speed;
    }

}
