package trafficsimulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Road {
	private int length;
	private List<Vehicle> vehicles;
	private List<TrafficLight> lights;
	
	
	
	public Road(int length) {
		this.length = length;
		this.vehicles = new ArrayList<Vehicle>();
		this.lights = new ArrayList<TrafficLight>();
	}

	public void addVehicle(Vehicle vehicle) {
		if(vehicle.getPosition() <= length) {
			vehicles.add(vehicle);
		}else {
			System.out.println("Cannot add vehicle: Position exceeds road length.");
		}
	}
	
	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}
	
	public void addtrafficLight(TrafficLight light) {
		lights.add(light);
	}
	
	public void updateTraffic() {
		
		Iterator<Vehicle> vehicleIterator = vehicles.iterator();
		while(vehicleIterator.hasNext()) {
			Vehicle vehicle = vehicleIterator.next();
			vehicle.move();
			if(vehicle.getPosition() > length) {
				System.out.println(vehicle.getType() + " has exceeded the road length. Position: " + vehicle.getPosition());
				vehicleIterator.remove();
			}
		}
			
		
		for(TrafficLight light : lights) {
			light.changeColor();
		}
		
		displayRoadState();
	}
	
	public void displayRoadState() {
		System.out.println("Road State:");
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		for(TrafficLight light : lights) {
			System.out.println(light);
		}
	}
}
