package basicjavaprg;

public class Parent {

	public static void main(String[] args) {
		System.out.println("Parent main");
	}
	
}
//class Child extends Parent {}
class Child extends Parent{
	public static void main(String[] args) {
		System.out.println("Child main");
	}
}

class Kid extends Child{
	public static void main(String[] args) {
		System.out.println("Kid main");
	}
}
