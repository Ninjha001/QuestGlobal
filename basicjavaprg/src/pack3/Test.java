package pack3;

class Test {
	public static void main(String[] args) {
		Child c = new Child();                  //when an object of a subclass is created, it would first pass the control to the parent class constructor. then it would pass control to the child class constructor. then only it would look for any particular sop statements in the current class.
		//System.out.println(c.hashCode());       //hashCode provides an objects unique memory address.
	}
}
