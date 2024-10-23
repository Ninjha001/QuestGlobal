package basicjavaprg;

abstract class Name{
	String name;
	Name(String name){
		this.name = name;
	}
	abstract void sound();
}

class Dog extends Name{
	Dog(String name){
		super(name);
	}
	void sound() {
		System.out.println(name+":"+" says Woof!");
	}
}

public class Animal{

	public static void main(String[] args) {
		Dog dog = new Dog("Buddy");
		dog.sound();
	}

}
