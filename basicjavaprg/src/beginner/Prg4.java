package beginner;

import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		int dif = a-b;
		int mul = a*b;
		int div = a/b;
		
		System.out.println(sum);
		System.out.println(dif);
		System.out.println(mul);
		System.out.println(div);
	}

}
