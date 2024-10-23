package basicjavaprg;

import java.util.*;
import java.util.Map.Entry;

public class DemoHashMapLinkedHashMap {
	public static void main(String[] args) {
		HashMap m = new HashMap();
//		LinkedHashMap m = new LinkedHashMap();     //insertion order is preserved.
		m.put("chiranjeevi", 500);
		m.put("nagarjuna", 800);
		m.put("balaji", 200);
		m.put("venkatesh", 700);
		System.out.println(m);
		
		Set s = m.keySet();    //stored in set because it returns keys as a Set.
		System.out.println(s);
		
		Collection c = m.values();    //stored in collection because it returns all the values as a Collection.
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);   // it will give the HashMap in the form of a Set.
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "-----" + m1.getValue());
			if(m1.getKey().equals("nagarjuna")) {
				m1.setValue(1000);
			}
		}
		System.out.println(m);
	}
}
