package basicjavaprg;

class DerivedStatic extends BaseStatic{
	static int x = 100;
	static {
		methodTwo();
		System.out.println("Derived First Static Block");
	}
	public static void main(String[] args) {
		methodTwo();
		System.out.println("Derived Main");
	}
	public static void methodTwo() {
		System.out.println(y);
	}
	static {
		System.out.println("Derived Second Static Block");
	}
	static int y = 200;
}
