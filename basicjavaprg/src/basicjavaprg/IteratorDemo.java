package basicjavaprg;
import java.util.Iterator;
import java.util.Vector;
public class IteratorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=0;i<10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		Iterator i = v.iterator();
		
		while(i.hasNext()) {
			Integer n = (Integer) i.next();
			if(n%2==0) {
				System.out.println(n);
			}
			else {
				i.remove();
			}
		}
		System.out.println(v);
	}

}
