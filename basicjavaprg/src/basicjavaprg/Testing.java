package basicjavaprg;

/*class Using1{
	int x = 10;
	
	public void method1() {
		System.out.println(x);
	}
}

public class Testing {
	public static void main(String[] args) {
		Using1 u1 = new Using1();
		u1.method1();
	}
}*/

/*class Using2{
	//static int x = 10;
	int x = 10;
	
	public static void method2() {
		System.out.println(x);         //cannot make a static reference to a non static variable.
	}
}

public class Testing {
	public static void main(String[] args) {
		Using2 u2 = new Using2();
		u2.method2();                                   //Using2.method2(); accessing the static method in a static way.
	}
}*/

/*class Using3{
	static int x = 10;
	
	public void method3() {
		System.out.println(x);               //can make a non static reference to a static variable.
	}
}

public class Testing {
	public static void main(String[] args) {
		Using3 u3 = new Using3();
		u3.method3();   
	}
}*/

/*class Using4{
	static int x = 10;
	
	public static void method4() {
		System.out.println(x);
	}
}

public class Testing {
	public static void main(String[] args) {
		Using4 u4 = new Using4();
		u4.method4();                             //Using4.method4();accessing the method in a static way.
	}
}*/

/*class Using5{
	int x = 10;
	static int x = 10;                          //duplication of x.
	
	public void method5() {
		System.out.println(x);
	}
	
	public static void method5() { 
		System.out.println(x);                            //duplication of the method method5().
	}
}*/


class ParentTesting{
	public static void display() {
		System.out.println("Display of Parent");
	}
	public void nonDisplay() {
		System.out.println("Non Display of Parent");
	}
}

class ChildTesting extends ParentTesting{
	public static void display() {
		System.out.println("Display of Child");
	}
	public void nonDisplay() {
		System.out.println("Non Display of Child");
	}
}

public class Testing{
	public static void main(String[] args) {
		ParentTesting p = new ParentTesting();
		ParentTesting c = new ChildTesting();
		ChildTesting c1 = new ChildTesting();
		//ParentTesting.display();
		//ChildTesting.display();
		
		p.display();
		c.display();
		c1.display();
		
		System.out.println();
		
		p.nonDisplay();
		c.nonDisplay();
		c1.nonDisplay();
	}
}
