package basicjavaprg;
class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	
	public void display() {
		System.out.println("Name: " + name + "-------" + "Age: " + age);
	}
}
public class DemoMethodChaining {

	public static void main(String[] args) {
		Person p = new Person("Alice",25);
		p.display();
		p.setName("Ardra").setAge(35).display();
		p.display();
	}

}
