package basicjavaprg;


public class StaticVariableExample {
	static int x;
	int y;
	
	public StaticVariableExample() {}
	
	public StaticVariableExample(int i) {
		super();
		x += i; 
		this.y = i;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticVariableExample.x);   //calling the static variable.
		
		StaticVariableExample sv = new StaticVariableExample(7);    //calling the static variable using constructor.
		System.out.println(sv.x);
		System.out.println(sv.y);
	}

}
