package basicjavaprg;

class TestSingleton{
	private static TestSingleton t = null;
	private TestSingleton() {}
	public static TestSingleton getTest() {
		if(t==null) {
			t = new TestSingleton();
		}
		return t;
	}
}

public class ExampleSingleton {
	public static void main(String[] args) {
		System.out.println(TestSingleton.getTest().hashCode());
		System.out.println(TestSingleton.getTest().hashCode());
		System.out.println(TestSingleton.getTest().hashCode());
	}
}
