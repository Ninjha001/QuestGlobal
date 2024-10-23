package basicjavaprg;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp{
	public String toString() {
		return "Temp";
	}
	public void finalize() {
		System.out.println("finalize() of GC is called");
	}
}
public class DemoWeakHashMap {
	public static void main(String[] args) {
		WeakHashMap m = new WeakHashMap();
//		HashMap m = new HashMap();
		Temp t = new Temp();
		m.put(t,"ashok");
		System.out.println(m);
		t = null;
		System.gc();
		System.out.println(m);
	}
}
