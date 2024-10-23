package carrentalsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Enter the duration of rental (in days): ");
        int duration = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the type of vehicle (Car/Bike/Truck): ");
        String vehicleType = scanner.nextLine();
        System.out.print("Enter any additional features (GPS/ChildSeat): ");
        String additionalFeature = scanner.nextLine();
        
        Vehicle vehicle;
        double baseRate = 0.00;
        
      
        if(vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car();
            baseRate = vehicle.getRentalRate();
        } else if(vehicleType.equalsIgnoreCase("Bike")) {
            vehicle = new Bike();
            baseRate = vehicle.getRentalRate();
        } else if(vehicleType.equalsIgnoreCase("Truck")) {
            vehicle = new Truck();
            baseRate = vehicle.getRentalRate();
        } else {
            System.out.println("Invalid vehicle type entered.");
            scanner.close();
            return;
        }
        
        RentalService rentalService = new RentalService();
        
        
        double totalCost = rentalService.calculateRentalCost(duration, baseRate, additionalFeature, vehicle);
        double additionalFeatureCharge = rentalService.getAdditionalFeatureCharge(additionalFeature);
       
        System.out.println("Rental Duration: " + duration + " days");
        System.out.println("Vehicle Type: " + vehicleType.toUpperCase());
        System.out.println("Base Rate for " + vehicleType.toUpperCase() + ": $" + vehicle.getRentalRate());
        System.out.println("Additional Feature: " + additionalFeature.toUpperCase());
        System.out.println("Additional Feature Cost: $" + additionalFeatureCharge);
        System.out.println("Total Rental Cost: $" + totalCost);
        
        scanner.close();
    }
}