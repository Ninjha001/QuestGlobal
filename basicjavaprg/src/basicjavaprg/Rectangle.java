package basicjavaprg;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		/*int l = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int a = l*b;
		int p = 2*(l+b);
		System.out.println("Area : "+a);
		System.out.println("Perimeter : "+p);*/
		
		//Object r = Class.forName(args[0].newInstance());
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle: ");
		int length = scan.nextInt();
		int breadth = scan.nextInt();
		System.out.println("Area : "+(length*breadth));
		System.out.println("Perimeter : "+(2*(length+breadth)));
		System.out.println();
		//System.out.println(r.getClass().getName());
	}
}
