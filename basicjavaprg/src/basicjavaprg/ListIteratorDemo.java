package basicjavaprg;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add("balakrishna");
		a.add("chiru");
		a.add("venki");
		a.add("krishna");
		a.add("nag");
		System.out.println(a);
		ListIterator l = a.listIterator();
		
		while(l.hasNext()) {
			String s = (String) l.next();
			if(s.equals("venki")) {
				l.remove();
			}
			if(s.equals("chiru")) {
				l.set("charu");
			}
			if(s.equals("nag")){
				l.add("sarvesh");
			}
		}
		
		System.out.println(a);
	}

}
