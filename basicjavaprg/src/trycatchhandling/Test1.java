package trycatchhandling;

public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println("Try is executed");
			System.out.println(10/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Catch is executed");
		}
		finally {
			System.out.println("Finally is executed");
		}
	}
}
