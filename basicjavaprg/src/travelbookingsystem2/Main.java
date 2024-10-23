package travelbookingsystem2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BookingCalculator calculator = new BookingCalculator();
		List<Booking> bookings = new ArrayList<>();

        System.out.print("Enter flight cost: ");
        double flightCost = scanner.nextDouble();
        bookings.add(new FlightBooking(flightCost));

        System.out.print("Enter hotel cost: ");
        double hotelCost = scanner.nextDouble();
        bookings.add(new HotelBooking(hotelCost));

        System.out.print("Enter rental car cost: ");
        double rentalCarCost = scanner.nextDouble();
        bookings.add(new RentalCarBooking(rentalCarCost));

        System.out.print("Enter discount code (or 'none' if not applicable): ");
        String discountCode = scanner.next();
       
        System.out.print("Enter tax rate (in percentage): ");
        double taxRate = scanner.nextDouble();

        double totalCost = calculator.calculateTotalCost(bookings, discountCode.equals("none") ? "" : discountCode, taxRate);

        System.out.println("\n--- Booking Summary ---");
        System.out.println("Flight Cost: $" + flightCost);
        System.out.println("Hotel Cost: $" + hotelCost);
        System.out.println("Rental Car Cost: $" + rentalCarCost);
        System.out.println("Discount Code: " + (discountCode.equals("none") ? "No discount applied" : discountCode));
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.printf("Total Booking Cost: $%.2f\n", totalCost);
        
        scanner.close();
	}

}
