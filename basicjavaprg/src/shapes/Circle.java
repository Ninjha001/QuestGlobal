package shapes;

//public class Circle implements Shapes         //implementing Shapes interface.

public class Circle extends Shape {
	protected double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void calculateArea() {
		double area = (22*radius*radius)/7;
		System.out.println("Area of the circle: "+area);
	}
	
	public void calculatePerimeter() {
		double perimeter = (2*22*radius)/7;
		System.out.println("Perimeter of the circle: "+perimeter);
	}
	
	
}
