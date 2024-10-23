package privatepackage2;

import privatepackage1.OuterClass;

public class SubClass extends OuterClass {
	SubClass(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		SubClass subClassObject = new SubClass("dog");
//		subClassObject.display();      //this doesn't work as the scope of private is within the same class only.
	}
}
