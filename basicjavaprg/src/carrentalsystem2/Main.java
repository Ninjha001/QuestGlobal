package carrentalsystem2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RentalCostCalculator rent = new RentalCostCalculator();
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the type of car (EconomyCar/MidsizeCar/LuxuryCar): ");
        String carType = scanner.next();
        System.out.print("Enter the duration for rental (in days): ");
        int duration = scanner.nextInt();
        System.out.print("Should the car be insured or not (true/false): ");
        boolean isInsuranceIncluded = scanner.nextBoolean();
        System.out.print("Enter the number of additional features to be included: ");
        int size = scanner.nextInt();
        
        
        String[] additionalFeatures = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the name of the additional feature: ");
            String feature = scanner.next();
            additionalFeatures[i] = feature; 
        }
        
        double totalRentCost = rent.calculateRentalCost(carType, duration, isInsuranceIncluded, additionalFeatures);
        
        System.out.printf("Total rent cost: $%.2f%n", totalRentCost);
        
		/*
		 * for(int i=0;i<size;i++) { System.out.print(additionalFeatures[i]+" "); }
		 */
        
        
        scanner.close();
    }
}
