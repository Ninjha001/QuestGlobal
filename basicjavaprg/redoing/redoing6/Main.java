package redoing6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the radius of the circle: ");
		double radius = scanner.nextDouble();
		if(radius>0) {
			Circle c = new Circle(radius);
			System.out.println("CIRCLE");
			System.out.println("-------");
			System.out.println("AREA: " + c.calculateArea());
			System.out.println("PERIMETER: " + c.calculatePerimeter());
			c.getColor("RED");
		}
		else {
			System.out.println("INVALID INPUT");
		}
		System.out.println();
		System.out.println("Enter the length and breadth of the rectangle: ");
		double length = scanner.nextDouble();
		double breadth = scanner.nextDouble();
		if(length>0 && breadth>0) {
			Rectangle r = new Rectangle(length, breadth);
			System.out.println("RECTANGLE");
			System.out.println("---------");
			System.out.println("AREA: " + r.calculateArea());
			System.out.println("PERIMETER: " + r.calculatePerimeter());
			r.getColor("YELLOW");
		}
		else {
			System.out.println("INVALID INPUTS");
		}
		System.out.println();
		System.out.println("Enter the side of the square: ");
		double side = scanner.nextDouble();
		if(side>0) {
			Square s = new Square(side);
			System.out.println("SQUARE");
			System.out.println("------");
			System.out.println("AREA: " + s.calculateArea());
			System.out.println("PERIMETER: " + s.calculatePerimeter());
			s.getColor("POWDERBLUE");
		}
		else {
			System.out.println("INVALID INPUT");
		}
		scanner.close();
	}

}
