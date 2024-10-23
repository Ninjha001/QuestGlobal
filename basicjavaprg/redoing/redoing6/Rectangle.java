package redoing6;

public class Rectangle implements ShapeI {
	private double length;
	private double breadth;
	Rectangle(double length,double breadth){
		this.breadth = breadth;
		this.length = length;
	}
	@Override
	public double calculateArea() {
		return length * breadth;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (length * breadth);
	}

	public void getColor(String color) {
		System.out.println("COLOR: " + color);
	}

}
