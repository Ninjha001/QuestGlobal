package trycatchhandling;

public class Test7 {
	public static void main(String[] args) throws InterruptedException{
		doStuff();
	}
	public static void doStuff() throws InterruptedException{
		doMoreStuff();
	}
	public static void doMoreStuff() throws InterruptedException{
		Thread.sleep(20000);
		System.out.println("HI I AM AWAKE");
	}
}
