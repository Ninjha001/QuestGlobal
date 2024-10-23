package basicjavaprg;

public class VariableArguments {
	
	/*public static void Length(int... x) {
		System.out.println(x.length);
	}
	public static void main(String[] args) {
		//VariableArguments va = new VariableArguments();
		Length();
		Length('a','b');
		//va.Length(2,3);
		Length('a','b','c');
		//va.Length(1,2,3);
	}*/
	
	
	
	public void Sum(int... x) {
		//int sum = 0;
		for(int i:x) {
			//sum+=i;
			System.out.print(i+" ");
		}
		System.out.println();
		//System.out.println(sum);
	}
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.Sum(2,3,4);
		va.Sum(2,3,4,5,6);
	}
	
	
	
	/*public static int Number(int x) {
		return x;
	}
	public static double Number(double x) {
		return x;
	}
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		System.out.println(va.Number(3));
		System.out.println(va.Number(50.34));
	}*/
	
	
	
	/*public static void Method(String s,int...x) {
		//System.out.print(s+" ");
		System.out.println(s);
		int sum = 0;
		for(int i: x) {
			sum+=i;
		}
		//System.out.print(sum);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.Method("Sreethu", 44);
	}*/
	
	
	
	/*public static int Give(int a) {
		return a;
	}
	public static int Give(int a,int b) {
		return a+b;
	}
	public static int Give(int...x) {
		int m=1;
		for(int i: x) {
			m=m*i;
		}
		return m; 
	}
	public static void main(String[] args) {
		VariableArguments va =new VariableArguments();
		System.out.println(va.Give(2));
		System.out.println(va.Give(2,5));
		System.out.println(va.Give(5,6,7));
	}*/
	
	/*public static void methodOne(int[]...x) {
		for(int[] a : x) {
			System.out.println(a[0]);
		}
	}
	public static void main(String[] args) {
		int[] l = {10,20,30};
		int[] m = {40,50};
		methodOne(l,m);
	}*/
	
	/*public static void methodOne(int[][]...x) {
		for(int[] a : x){
			for(int[] b : a) {
				
			}
		}
	}*/

}
