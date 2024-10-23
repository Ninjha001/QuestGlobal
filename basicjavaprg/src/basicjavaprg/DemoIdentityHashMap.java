package basicjavaprg;

import java.security.Identity;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class DemoIdentityHashMap {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
//		HashMap m = new HashMap();        //if we use this, it would treat the second entry as duplicate, because the .equals() method is overridden in Wrapper classes for content comparison.
		IdentityHashMap m = new IdentityHashMap();
		m.put(i1, "kalyan");
		m.put(i2, "pavan");
		System.out.println(m);
	}

}
