package basicjavaprg;
import java.util.Comparator;
import java.util.TreeSet;

class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
//		return s1.compareTo(s2);                            //ascending order
//		return s2.compareTo(s1);                            //descending order
//		return -s1.compareTo(s2);                           
//		return -s2.compareTo(s1);
//		return -1;
//		return +1;
		return 0;
	}
	
}

public class DemoComparatorString {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("G"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		
		System.out.println(t);
	}

}
