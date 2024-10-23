package homeautomationsystem;

public class Light extends SmartDevice {
	private int brightness;
	
	public Light() {
		super();
		this.brightness = 0;
	}
	@Override
	public void operate() {
		System.out.println("Light is " + (isOn ? "ON" : "OFF") + ", Brightness: " + brightness);
	}
	
	public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

}
