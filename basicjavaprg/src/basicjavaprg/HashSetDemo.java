package basicjavaprg;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add("D");
		h.add("C");
		h.add("Z");
		h.add(null);
		h.add("B");
		System.out.println(h.add("Z"));  //returns falls because HashSet doesn't allow for duplicates.
		System.out.println(h);     //here, the order of adding the elements is not preserved.
	}

}
