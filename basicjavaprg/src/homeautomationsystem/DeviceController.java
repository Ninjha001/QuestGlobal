package homeautomationsystem;

import java.util.HashMap;

public class DeviceController {
	
	private HashMap<Integer, SmartDevice> devices;
	
	public DeviceController(){
		this.devices = new HashMap<Integer, SmartDevice>();
	}
	
	public void addDevice(int deviceId, SmartDevice device) {
		devices.put(deviceId, device);
	}
	
	public void controlDevice(int deviceId, String command) {
        SmartDevice device = devices.get(deviceId);
        if(device != null) {
        	if(command.equalsIgnoreCase("ON")) {
        		device.isTurnOn();
        	}else if(command.equalsIgnoreCase("OFF")){
        		device.isTurnOff();
        	}
        	device.operate();
        }else {
        	System.out.println("Device ID: " + deviceId + " not found.");
        }
    }
	
	public void controlDevice(int deviceId, String command, int setting) {
        SmartDevice device = devices.get(deviceId);
        if(device != null) {
        	if(device instanceof Light) {
        		((Light) device).setBrightness(setting);
        	}else if(device instanceof Fan) {
        		((Fan) device).setSpeed(setting);
        	}else if(device instanceof ThermoStat) {
        		((ThermoStat) device).getTemperature(setting);
        	}
        	device.operate();
        }else {
        	System.out.println("Device ID" + deviceId + " not found.");
        }
	}
	
	public void controlDevice(int deviceId, String command, int setting, String mode) {
	    SmartDevice device = devices.get(deviceId);
	    if (device != null) {
	        controlDevice(deviceId, command, setting); 
	        System.out.println("Mode set to: " + mode);
	        device.operate();
	    } else {
	        System.out.println("Device ID " + deviceId + " not found.");
	    }
	}

}
