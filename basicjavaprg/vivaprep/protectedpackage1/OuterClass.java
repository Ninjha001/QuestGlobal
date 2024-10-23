package protectedpackage1;

public class OuterClass {

	protected String name;
	
	public OuterClass(String name){
		this.name=name;
	}
	protected void display() {
		System.out.println("The name of the animal is "+name);
	}
	
	public static void main(String[] args) {
		OuterClass outerClassObject = new OuterClass("dog");
		outerClassObject.display();
	}
}
