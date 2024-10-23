package basicjavaprg;

public class Dummy {
	int x = 10;
	static int y = 20;
	
	public static void main(String[] args) {
		Dummy t1 = new Dummy();
		t1.x = 888;
		t1.y = 999;
		Dummy t2 = new Dummy();
		
		System.out.println(t1.x);
		System.out.println(t1.y);
		
		System.out.println(t2.x);
		System.out.println(t2.y);
		
		Dummy t3 = new Dummy();
		t3.x = 33;
		t3.y = 22;
		
		System.out.println(t3.x);
		System.out.println(t3.y);
		
		System.out.println(t1.y+" "+t2.y+" "+t3.y);
	}

}
