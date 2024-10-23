package basicjavaprg;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.set(0, "ashok");
		System.out.println(l);
		l.addFirst("software");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.set(0, "venky");
		System.out.println(l);
		l.removeAll(l);
		System.out.println(l);
	}

}
