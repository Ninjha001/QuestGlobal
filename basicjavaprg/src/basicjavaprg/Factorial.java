package basicjavaprg;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		//double fact = 1;                     //using int, long may not be helpful for holding large numbers.
		BigInteger fact = BigInteger.ONE;
		if(number<0) {
			System.out.println("Enter a correct number.");
			number = scan.nextInt();
		}
		if(number == 0 || number == 1) {
			System.out.println("The factorial of the number "+number+" is "+fact);
		}
		else{
			for(int i = number;i>0;--i) {
				//fact = fact * i;
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println("The factorial of the number "+number+" is "+fact);	
		}
		scan.close();
	}

}
