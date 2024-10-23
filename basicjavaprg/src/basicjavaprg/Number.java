package basicjavaprg;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number1 = scan.nextInt();
			if(number1>0 && number1!=0) {
				System.out.println("The number is Positive");
			}else if(number1<0 && number1!=0) {
				System.out.println("The number is Negative");
			}else {
				System.out.println("The number is Zero");
			}
	}

}
