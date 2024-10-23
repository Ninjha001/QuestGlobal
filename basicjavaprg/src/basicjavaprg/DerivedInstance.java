package basicjavaprg;

public class DerivedInstance extends BaseInstance {
	int i = 100;
	{
		methodTwo();
		System.out.println("First Derived Instance Block");
	}
	DerivedInstance(){
		System.out.println("Derived Constructor");
	}
	public static void main(String[] args) {
		DerivedInstance derived = new DerivedInstance();
		System.out.println("Derived Main");
	}
	public void methodTwo() {
		System.out.println(j);
	}
	int j = 200;

}
