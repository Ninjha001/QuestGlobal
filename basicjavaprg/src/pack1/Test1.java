package pack1;

//import pack1.Test;

public class Test1 {

	public static void main(String[] args) {
		Test t = new Test();
		t.methodOne();
		//t.methodTwo();   // private methods cannot be implemented even from the same package.
		t.methodThree();
		t.methodFour();
	}
}
