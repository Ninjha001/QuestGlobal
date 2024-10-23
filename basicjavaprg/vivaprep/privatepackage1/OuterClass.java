package privatepackage1;

public class OuterClass {
	private String name;
	public OuterClass(String name) {
		this.name=name;
	}
	private void display() {
		System.out.println("The name of the animal is "+name);
	}
	
}
