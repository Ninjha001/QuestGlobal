package trycatchhandling;

public class Test8 extends Exception {
	public static void main(String[] args) {
		doStuff();
	}
	public static void doStuff() {
		doMoreStuff();
	}
	public static void doMoreStuff() {
		System.out.println(10/0);
	}
}
