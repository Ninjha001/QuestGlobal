package basicjavaprg;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator4 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1  = (Employee)o1;
		Employee e2 = (Employee)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
		
	}
	
}

class Employee implements Comparable{
	String name;
	int eid;
	public Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	public String toString() {
		return name+"------"+eid;
	}
	@Override
	public int compareTo(Object o) {
		int eid1 = this.eid;
		int eid2 = ((Employee)o).eid;
		if(eid1<eid2) {
			return -1;
		}
		else if(eid1>eid2) {
			return +1;
		}
		else {
			return 0;
		}
	}
	
	
}

public class CompComp {

	public static void main(String[] args) {
		Employee e1 = new Employee("balaji", 200);
		Employee e2 = new Employee("chirag", 50);
		Employee e3 = new Employee("nag", 150);
		Employee e4 = new Employee("venki", 100);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);
		System.out.println();
		TreeSet t2 = new TreeSet(new MyComparator4());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		System.out.println(t2);
	}

}
