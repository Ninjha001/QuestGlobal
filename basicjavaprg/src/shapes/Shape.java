package shapes;

public abstract class Shape {
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	public final void getColour(String color) {
		System.out.println("The colour of the shape is: "+color);
	}
}
