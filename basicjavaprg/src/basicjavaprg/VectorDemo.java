package basicjavaprg;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector<>();
		System.out.println(v.capacity());
		for(int i=1;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());   //current capacity * 2 = new capacity
		System.out.println(v);
		v.removeFirst();
		System.out.println(v);
		System.out.println(v.size());
		v.removeLast();
		System.out.println(v);
		v.removeAll(v);
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
