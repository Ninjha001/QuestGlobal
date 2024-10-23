package shapes;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		String color;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		double radius = scan.nextDouble();
		if(radius>0) {
			Circle c = new Circle(radius);
			System.out.print("Enter the color: ");
			color = scan.next();
			System.out.println();
			c.calculateArea();
			c.calculatePerimeter();
			c.getColour(color);
		}else {
			System.out.print("Invalid radius constant.");
			System.out.println();
		}
		
		
		System.out.print("Enter the length of the rectangle: ");
		double length = scan.nextDouble();
		System.out.print("Enter the breadth of the rectangle: ");
		double breadth = scan.nextDouble();
		scan.nextLine();
		if(length>0 && breadth>0) {
			Rectangle r = new Rectangle(length,breadth);
			System.out.print("Enter the color: ");
			color = scan.nextLine();
			System.out.println();
			r.calculateArea();
			r.calculatePerimeter();
			r.getColour(color);
		}else {
			System.out.print("Invalid length and/or breadth constants.");
			System.out.println();
		}
		
		
		
		System.out.print("Enter the side of the square: ");
		double side = scan.nextDouble();
		scan.nextLine();
		if(side>0) {
			Square s = new Square(side);
			System.out.print("Enter the color: ");
			color = scan.next();
			System.out.println();
			s.calculateArea();
			s.calculatePerimeter();
			s.getColour(color);
		}else {
			System.out.print("Invalid side constant.");
			System.out.println();
		}
		
		scan.close();
	}

}
