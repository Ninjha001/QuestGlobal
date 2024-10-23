package stringmanipulations;

public class ConcatenateCompareClasses {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello");
		long startTime = System.nanoTime();
		s1 = s1.append("World");
		long endTime = System.nanoTime();
		//System.out.println(s1);
		System.out.println("Time taken by StringBuffer class: "+(startTime-endTime));
		
		StringBuilder s2 = new StringBuilder("Hello");
		startTime = System.nanoTime();
		s2 = s2.append("World");
		endTime = System.nanoTime();
		//System.out.println(s2);
		System.out.println("Time taken by StringBuilder class: "+(startTime-endTime));
	}
}
