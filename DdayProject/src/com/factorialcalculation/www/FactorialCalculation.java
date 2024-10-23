package com.factorialcalculation.www;

import java.util.Scanner;

public class FactorialCalculation {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int fact = 1;
		System.out.println("enter the non-negative number: ");
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		int numberCopy = number;
		try {
			if(number < 0)
				throw new NegativeNumberException("Enter a valid positive number");
			else {
				if(number == 0 || number == 1)
					System.out.println("Factorial of number "+number+" is "+fact);
				else {
					while(number>0) {
						fact = fact * (number);
						--number;
					}
					System.out.println("Factorial of number "+numberCopy+" is "+fact);
				}
				
			}
		}
		catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithematic exception occured");
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format exception occured");
		}
	}

}
