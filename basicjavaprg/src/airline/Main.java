package airline;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReservationSystem rs = new ReservationSystem();
		
		rs.addFlight(new Flight("FGH5474", "3:00AM", "8:00PM", 2));
		rs.addFlight(new Flight("GFYEBF538", "4:00PM", "00:23AM", 3));
		
		while(true) {
			System.out.println();
			System.out.println("Welcome to the AirLine Reservation System!");
			System.out.println("1. Book Flight");
			System.out.println("2. Cancel Flight");
			System.out.println("3. Check Flight");
			System.out.println("4. Exit");
			
			System.out.println("Choose an option (1/2/3/4): ");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch(option) {
			case 1:
				try {
					System.out.println("Enter flight number: ");
					String flightNo = scanner.nextLine();
					System.out.println("Enter the passenger name: ");
					String passengerName = scanner.nextLine();
					System.out.println("Enter the number of tickets: ");
					int noOfTickets = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter the type of ticket: ");
					String ticketType = scanner.nextLine();
					rs.bookFlight(flightNo, passengerName);
					System.out.println();
					System.out.println("BOOKING CONFIRMATION DETAILS");
					System.out.println("----------------------------");
					rs.calculateFare(passengerName, flightNo, noOfTickets, ticketType);
				}
				catch(FlightNotFoundException | FlightFullException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2: 
				try {
					System.out.println("Enter the flight number to be cancelled: ");
					String cancelFlightNo = scanner.nextLine();
					System.out.println("Enter the passenger name: ");
					String passengerName = scanner.nextLine();
					System.out.println();
					System.out.println("CANCEL CONFIRMATION DETAILS");
					System.out.println("---------------------------");
					rs.displayDetails(passengerName, cancelFlightNo);
					System.out.println();
					rs.cancelFlight(cancelFlightNo, passengerName);
				}
				catch(FlightNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3: 
				try {
					System.out.println("Enter the flight number to be checked: ");
					String flightNo = scanner.nextLine();
					System.out.println();
					rs.checkAvailability(flightNo);
				}
				catch (FlightNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Exiting program...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Enter a valid option");
			}
		}
	}
}
