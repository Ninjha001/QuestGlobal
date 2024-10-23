package basicjavaprg;

public class ObjectCountDemo {
	static int count = 0;
	public ObjectCountDemo() {}
	public ObjectCountDemo(int i) {}
	
	{count++;}
	
	public static void main(String... args) {
		ObjectCountDemo o1 = new ObjectCountDemo();
		ObjectCountDemo o2 = new ObjectCountDemo(10);
		ObjectCountDemo o3 = new ObjectCountDemo();
		System.out.println(count);
	}
}
