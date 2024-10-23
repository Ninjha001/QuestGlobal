package pack1;

public class Test {
	public void methodOne(){
		System.out.println("Test methodOne executed successfully");
	}
	private void methodTwo() {
		System.out.println("Test methodTwo executed successfully");
	}
	protected void methodThree() {
		System.out.println("Test methodThree executed successfully");
	}
	static void methodFour() {
		System.out.println("Test methodFour executed successfully");
	}
	
	public static void main(String[] args) {
		String s = new String("java");
		System.out.println(s);
	}
}
