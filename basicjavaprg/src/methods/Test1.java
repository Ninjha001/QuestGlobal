package methods;

public class Test1 {
	int i;
	Test1(int i){
		this.i=i;
	}
	
	public int hashCode() {
		return i;
	}
	
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Test1) {
			Test1 test = (Test1) obj;
			if(i==test.i) {
				return true;
			}
		}
		else {
			return false;
		}
		return false;
	}
	
	public String toString() {
		return "Overriden toString";
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1(10);
		Test1 t2 = new Test1(20);
		
		Test1 t3 = t2;
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		System.out.println(t1.equals(t2));
		System.out.println(t3.equals(t2));
		System.out.println(t1.equals(t1));
		
		System.out.println(t1);
		System.out.println(t2);
	}
}
