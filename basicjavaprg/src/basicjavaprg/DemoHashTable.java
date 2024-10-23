package basicjavaprg;

import java.util.Hashtable;
class Test14{
	int i;
	Test14(int i){
		this.i = i;
	}
	public int hashCode() {
		return i;
//		return i%9;
	}
	public String toString() {
		return i + " ";
	}
}
public class DemoHashTable {

	public static void main(String[] args) {
		Hashtable t = new Hashtable();
		t.put(new Test14(5), "A");
		t.put(new Test14(2), "B");
		t.put(new Test14(6), "C");
		t.put(new Test14(15), "D");
		t.put(new Test14(23), "E");
		t.put(new Test14(16), "F");
		System.out.println(t);
		
	}

}
