package basicjavaprg;
import java.util.*;

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i = (Integer)o1;
		Integer j = (Integer)o2;
		if(i<j) {
			return +1;
		}
		else if(i>j) {
			return -1;
		}
		else {
			return 0;
		}
		
//		return i.compareTo(j);
//		return j.compareTo(i);
//		return -i.compareTo(j);
//		return -j.compareTo(i);
//		return +1;
//		return -1;
//		return 0;            //because the rest will be treated as duplicates and treeSet doesn't allow the implementation of duplicates.
	}
	
}

public class DemoComparatorInteger {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
//		t.add(null);           //gives me NULL POINTER EXCEPTION
		t.add(15);
		t.add(20);
		t.add(5);
		System.out.println(t);
	}
}
