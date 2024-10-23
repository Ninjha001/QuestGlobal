package basicjavaprg;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<String>();
		s.add("Banana");
		s.add("Apple");
		s.add("Orange");
		s.add("Grapes");
		
		System.out.println(s);
		
		String fruitToCheck = "Apple";
		
	}

}
