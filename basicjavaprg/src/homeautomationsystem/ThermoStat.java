package homeautomationsystem;

public class ThermoStat extends SmartDevice {
	private int temperature;
	
	ThermoStat(){
		super();
		this.temperature = 22;
	}
	
	@Override
	public void operate() {
		System.out.println("ThermoStat is " + (isOn ? "ON" : "OFF")+", temperature: " + temperature);
	}

	public void getTemperature(int temperature) {
		this.temperature = temperature;
	}
}
