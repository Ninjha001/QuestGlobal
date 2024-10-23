package airline;
import java.util.HashMap;
import java.util.Map;
public class ReservationSystem {
	private Map<String,Flight> Flights;

	public ReservationSystem() {
		this.Flights = new HashMap<>();
	}
	
	public void addFlight(Flight flight) {
		Flights.put(flight.getFlightNo(), flight);
	}
	
	public void bookFlight(String flightNo, String passengerName) throws FlightNotFoundException, FlightFullException {
		if(!Flights.containsKey(flightNo)) {
			throw new FlightNotFoundException("The requsted flight is not available");
		}
		Flight flight = Flights.get(flightNo);
		flight.bookFlight(passengerName);
		System.out.println("Flight booked successfully for " + passengerName);
		
	}
	
	public void cancelFlight(String flightNo, String passengerName) throws FlightNotFoundException{
		if(!Flights.containsKey(flightNo)) {
			throw new FlightNotFoundException("The requested flight is not available");
		}
		Flight flight = Flights.get(flightNo);
		flight.cancelFlight(passengerName);
		System.out.println("Flight cancelled successfully for " + passengerName);
	}
	
	public void checkAvailability(String flightNo) throws FlightNotFoundException {
		if(!Flights.containsKey(flightNo)) {
			throw new FlightNotFoundException("The requested flight is not available");
		}
		Flights.get(flightNo).displayAvailability();
	}
	
	public void displayDetails(String passengerName,String flightNo) {
		System.out.println("Passenger name: " + passengerName);
		System.out.println("Flight number: " + flightNo);
	}
	
	public void calculateFare(String passengerName,String flightNo, int noOfTickets,String ticketType) {
		if(ticketType.equalsIgnoreCase("economy")) {
			double cost = noOfTickets * 2000;
			displayDetails(passengerName, flightNo);
			System.out.println("Ticket type: " + ticketType);
			System.out.println("No of Tickets: " + noOfTickets);
			System.out.println("Total Cost: " + cost);
		}
		if(ticketType.equalsIgnoreCase("fsecondclass")) {
			double cost = noOfTickets * 4000;
			displayDetails(passengerName, flightNo);
			System.out.println("Ticket type: " + ticketType);
			System.out.println("No of Tickets: " + noOfTickets);
			System.out.println("Total Cost: " + cost);
		}
		if(ticketType.equalsIgnoreCase("firstclass")) {
			double cost = noOfTickets * 6000;
			displayDetails(passengerName, flightNo);
			System.out.println("Ticket type: " + ticketType);
			System.out.println("No of Tickets: " + noOfTickets);
			System.out.println("Total Cost: " + cost);
		}
	}

}
