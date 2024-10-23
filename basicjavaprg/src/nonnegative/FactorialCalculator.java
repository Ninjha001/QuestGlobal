package nonnegative;
import java.util.Scanner;

class NegativeNumberException extends Exception {
	public NegativeNumberException(String s) {
		super(s);
	}
}
public class FactorialCalculator{
	public static long Factorial(int num)  throws NegativeNumberException {
		if(num<0) {
			throw new NegativeNumberException("Negative Number is not permitted");
		}
		long fact = num;
		if(num==0 || num==1) {
			fact = 1;
			return fact;
		}
		return fact * Factorial(num-1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the number: ");
//			int num = scanner.nextInt();
			String input = scanner.next();
			int num = Integer.parseInt(input);
			long result = Factorial(num);
			System.out.println("Factorial of "+ num +" is "+ result);
		}
		
		catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception " + e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception " + e.getMessage());
		}
		
		finally {
			scanner.close();
		}
	}
}