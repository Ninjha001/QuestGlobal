package interfaces;

public class Test implements Left, Right {

	/*
	 * public void method() { System.out.println("Overriden method of interfaces");
	 * }
	 * 
	 * public void method(int i) { System.out.println(i); }
	 */
	
	
	public static void main(String[] args) {
		/*
		 * Left.method(); Right.method();
		 */
		
		/*
		 * Left.method(); Left.method(20); Right.method(); Right.method(10);
		 */
		
		//System.out.println(x);           //this will get ambiguous.
		System.out.println(Left.x);
		System.out.println(Right.x);
	}

}
