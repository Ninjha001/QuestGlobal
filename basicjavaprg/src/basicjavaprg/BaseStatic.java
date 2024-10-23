package basicjavaprg;

class BaseStatic {
	static int i=10;
	static {
		methodOne();
		System.out.println("Base Static Block");
	}
	public static void main(String[] args) {
		methodOne();
		System.out.println("Base Main");
	}
	public static void methodOne() {
		System.out.println(j);
	}
	static int j =20;
}
