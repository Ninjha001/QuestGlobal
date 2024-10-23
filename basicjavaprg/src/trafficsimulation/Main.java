package trafficsimulation;

public class Main {
	public static void main(String[] args) {
		Road road = new Road(25);
		
		Vehicle car = new Vehicle("Car", 10, 0);
		Vehicle truck = new Vehicle("Truck", 5, 0);
		Vehicle motorcycle = new Vehicle("Motorcycle", 15, 0);
		
		road.addVehicle(car);
		road.addVehicle(truck);
		road.addVehicle(motorcycle);
		
		TrafficLight light1 = new TrafficLight("red", 10);
		road.addtrafficLight(light1);
		
		road.displayRoadState();
		
		road.updateTraffic();
		
		road.updateTraffic();
	}
}
