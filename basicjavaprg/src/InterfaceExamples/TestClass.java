package InterfaceExamples;

public class TestClass implements TestInterface {
	//int x = 10;                     
	//static int x = 10;              this is possible since the static variable has been declared outside the method. which gives it class level declaration. 
	public static void main(String[] args) {
		//int x = 10;                 this is possible because we are creating a local variable of the same interface variable and the compiler will print out the local value.
		//final int x = 10;           this is valid because it is a final local variable declaration.
		//static int x = 10;          this is not valid because static variables cannot be declared within the method scope
		//x = 20;                     this will not provide us output since interface variable cannot be reassigned(f,p,s).
		System.out.println(x);
		//System.out.println(TestInterface.x);   this way, we can call out the interface variable.
	}
}
