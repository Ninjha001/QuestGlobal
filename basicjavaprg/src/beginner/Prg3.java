package beginner;

import java.util.Scanner;

public class Prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,t;
		a = sc.nextInt();
		b = sc.nextInt();
		t = a;
		a = b;
		b = t;
		
		System.out.println(a);
		System.out.println(b);
	}

}
