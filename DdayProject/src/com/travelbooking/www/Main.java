package com.travelbooking.www;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FareCalculator fare = new FareCalculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the distance(in kms): ");
		double distance = scanner.nextDouble();
		System.out.println("enter the base fare per km: ");
		double baseFarePerKm = scanner.nextDouble();
		System.out.println("enter the discount(in %) to be applied: ");
		double discount = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("enter the mode of travel(bus/train/flight): ");
		String travelMode = scanner.nextLine();
		System.out.println();
		System.out.println("DETAILS");
		System.out.println("-------");
		System.out.println("Mode of Travel: " + travelMode);
		System.out.println("Distance: " + distance+" kms");
		System.out.println("Base Fare Per Km: $"+baseFarePerKm);
		System.out.println("Discount(%): "+discount);
		System.out.println("Final Cost: $"+fare.calculateFare(distance, baseFarePerKm, discount, travelMode));
		scanner.close();
	}

}
