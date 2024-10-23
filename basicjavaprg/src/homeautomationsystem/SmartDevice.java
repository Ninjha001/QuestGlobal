package homeautomationsystem;

public abstract class SmartDevice {
	public boolean isOn;
	
	SmartDevice(){
		this.isOn = false;
	}
	
	public boolean isDeviceOn() {
		return isOn;
	}
	
	public abstract void operate();
	
	public void isTurnOn() {
		isOn = true;
	}
	
	public void isTurnOff() {
		isOn = false;
	}
}
