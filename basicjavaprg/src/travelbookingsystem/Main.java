package travelbookingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Passenger> passengers = new ArrayList<>();
        
        System.out.println();
        
        System.out.print("Enter travel distance (km): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter travel mode (Bus, Train, Flight): ");
        String travelMode = scanner.next();
        
        System.out.print("Enter the number of passengers: ");
        int numberOfPassengers = scanner.nextInt();
        
        for (int i = 0; i < numberOfPassengers; i++) {
            System.out.print("Enter passenger type (Adult, Child, Senior): ");
            String passengerType = scanner.next();
            passengers.add(new Passenger(passengerType));
        }

        double totalFare = 0;

        for (Passenger passenger : passengers) {
            double fare = FareCalculator.calculateFare(distance, passenger, travelMode);
            totalFare += fare;

            System.out.printf("Fare for %s: $%.2f\n", passenger.getType(), fare);
        }
        System.out.printf("\nTotal Fare for all passengers: $%.2f\n", totalFare);
        
        scanner.close();
    }
}