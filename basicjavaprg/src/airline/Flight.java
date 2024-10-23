package airline;
import java.util.ArrayList;
import java.util.List;
public class Flight {
	private String flightNo;
	private String departureTime;
	private String arrivalTime;
	private int maxCapacity;
	private List<String> passenger;
	
	public Flight(String flightNo, String departureTime, String arrivalTime, int maxCapacity) {
		super();
		this.flightNo = flightNo;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.maxCapacity = maxCapacity;
		this.passenger = new ArrayList<>();
	}

	public String getFlightNo() {
		return flightNo;
	}
	
	public boolean isFull() {
		return passenger.size()>=maxCapacity;
	}
	
	public void bookFlight(String passengerName) throws FlightFullException{
		if(isFull()) {
			throw new FlightFullException("Flight is full");
		}
		passenger.add(passengerName);
	}
	
	public void cancelFlight(String passengerName) throws FlightNotFoundException{
		if(!passenger.remove(passengerName)) {
			throw new FlightNotFoundException("Passenger "+passengerName + " is not found on flight "+flightNo);
		}
	}
	
	public void displayAvailability() {
		System.out.println("Flight Number: " + flightNo);
		System.out.println("Departure Time; " + departureTime);
		System.out.println("Arrival Time: " + arrivalTime);
		System.out.println("Maximum Capacity: " + maxCapacity);
		System.out.println("Current Booked Passengers: " + passenger.size());
	}

}
