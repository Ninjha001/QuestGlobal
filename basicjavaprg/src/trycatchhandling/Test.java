package trycatchhandling;

;

public class Test {
	public static void main(String[] args) {
		System.out.println("Statement 1");
		//System.out.println(10/0);
		
		
		try { 
			System.out.println(10/0); 
			System.out.println("Statment 3"); //this will not be executed.
		}
		catch(ArithmeticException ae) { 
			System.out.println(3);  
		}
		catch(Exception obj) {
		 System.out.println(10/2);
			/*
			 * System.out.println(obj.getMessage()); //description of the message
			 * System.out.println(obj.toString()); //exception name + description
			 * obj.printStackTrace();
			 */
		}
		/*
		 * catch(ArithmeticException ae) { System.out.println(3); //this will create an
		 * error because of the heirachical ordering from parent to children. }
		 */
		 
		System.out.println("Statement 2");
	}
}
