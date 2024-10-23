package basicjavaprg;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator5 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
	
}
public class DemoTreeMap {
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(100, "ZZZ");
		t.put(103, "XXX");
		t.put(101, "YYY");
		t.put(104, 106);
		t.put(107, null);
		System.out.println(t);
//		t.put("FFF", "XXX");   //class cast exception.
//		t.put(null, "XXX");    //null pointer exception.
		
		
		TreeMap t2 = new TreeMap(new MyComparator5());
		t2.put("XXX", 10);
		t2.put("AAA", 20);
		t2.put("YYY", 30);
		t2.put("LLL", 40);
		System.out.println(t2);
	}
}
