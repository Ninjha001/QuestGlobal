package redoing6;

public class Circle implements ShapeI {
	private double radius;
	Circle(double radius){
		if(radius>0) {
			this.radius = radius;
		}
		else {
			System.out.println("INVALID INPUT");
		}
	}
	@Override
	public double calculateArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * 3.14 * radius;
	}
	
	public void getColor(String color) {
		System.out.println("COLOR: " + color);
	}

}
