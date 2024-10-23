package shapes;

//public class Rectangle implements Shapes      //implementing Shapes interface.

public class Rectangle extends Shape {
	protected double length;
	protected double breadth;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle(double side) {
		this.length = side;
		this.breadth = side;
	}

	public void calculateArea() {
		if(length == breadth) {
			double area = length*breadth;
			System.out.println("Area of Square: "+area);
		}else {
			double area = length*breadth;
			System.out.println("Area of Rectangle: "+area);
		}
		
	}

	public void calculatePerimeter() {
		if(length == breadth) {
			double perimeter = 2*(length+breadth);
			System.out.println("Perimeter of Square: "+perimeter);
		}else {
			double perimeter = 2*(length+breadth);
			System.out.println("Perimeter of Rectangle: "+perimeter);
		}
	}

}
