package redoing6;

public abstract class Shape {
	abstract double calculateArea();
	abstract double calculatePerimeter();
	public void getColor(String color) {
		System.out.println("COLOR: " + color);
	}
}
