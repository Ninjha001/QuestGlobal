package basicjavaprg;

public class Test {
	static int i;
	static int j = 11;
	static String s;
	
	int n1=4;
	int n2=5;
	
	int sum(int a,int b) {
		System.out.println(mul(3,4));
		return a+b;
	}
	
	static int mul(int a,int b) {
		return a*b;
	}
	
	void Test1(int a,int b,String st){
		this.i = a;
		this.j = b;
		this.s = st;
		System.out.println(a+" "+b+" "+st);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.j);
		System.out.println(t.i);
		System.out.println(t.s);
		
		System.out.println();
		
		System.out.println(Test.j);
		System.out.println(Test.i);
		System.out.println(Test.s);
		
		System.out.println();
		
		System.out.println(j);
		System.out.println(i);
		System.out.println(s);
		
		System.out.println();
		
		System.out.println(t.sum(3, 4));
		
		System.out.println();
		
		System.out.println(t.n1);
		System.out.println(t.n2);
		
		System.out.println();
		
		t.Test1(22,24,"Neerja");
		//System.out.println(n1);
	}

}
