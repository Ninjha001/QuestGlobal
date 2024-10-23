package basicjavaprg;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		l.add("B");
		l.add("D");
		l.add("C");
		l.add(null);
		l.add("A");
		l.add(10);
		System.out.println(l);   //here, the order of adding the elements is preserved. It also doesn't support duplication of elements.
	}

}
