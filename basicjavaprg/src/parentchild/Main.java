package parentchild;

class Parent {
	void display() {
		System.out.println("Parent display is printed");
	}
}

class Child extends Parent{
}

class Child1 extends Parent{
	@Override
	void display() {
		System.out.println("Child display is printed");
	}
}

public class Main {

	public static void main(String[] args) {
		//Parent parentRef = new Child1();
		//parentRef.display();
		//Child1 childRef = new Child1();
		//childRef.display();
		

	}

}
