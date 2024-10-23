package basicjavaprg;
import java.util.*;


class MyComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1<l2) {
			return -1;
		}
		else if(l1>l2) {
			return +1;
		}
		else {
			return s1.compareTo(s2);
		}
	}
	
}
public class DemoComparartorString2 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator3());
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("xx");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}
