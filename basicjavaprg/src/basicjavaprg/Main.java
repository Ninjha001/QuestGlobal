package basicjavaprg;

public class Main {

	public static void main(String[] args) {
		methodTwo(10,20);                                         //10 and 20 are called actual parameters. because they are passed through the function call inside the main method.
	}
	
	public static void methodTwo(final int x,int y) {             //x and y are called formal parameters.
		//x = 100;
		//y = 200;                                                //if i don't initialise my y to 200, the values 10 and 20 will be passed and summed.
		                                                          //if i initialise my y to 200, then the values 10 and 200 will be summed.
		                                                          //if i initialise x to 100 in addition to y to 200, it would produce an error as x being a final variable, cannot be reassigned to 100.
		System.out.println(x+y);
	}
}


