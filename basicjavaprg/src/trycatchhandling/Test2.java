package trycatchhandling;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(Test2.method());
	}
	
	public static int method() {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			return 888;
		}
		finally {
			return 999;
		}
	}
}
