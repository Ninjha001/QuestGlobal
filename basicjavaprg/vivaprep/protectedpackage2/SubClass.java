package protectedpackage2;

import protectedpackage1.OuterClass;

public class SubClass extends OuterClass {
	
	SubClass(String name) {
		super(name);
	}

	public static void main(String[] args) {
		SubClass subClassobj = new SubClass("dog");
		subClassobj.display();
	}

}