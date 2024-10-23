package stringmanipulations;

public class CompareClasses {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		StringBuilder s1 = new StringBuilder();
		for(int i=0;i<10000;i++) {
			s1.append("Hello");
		}
		long endTime = System.nanoTime();
		System.out.println("Time taken by StringBuilder class: " + (startTime - endTime) + " ms");
		System.out.println();
		startTime = System.nanoTime();
		StringBuffer s2 = new StringBuffer();
		for(int i=0;i<10000;i++) {
			s2.append("Hello");
		}
		endTime = System.nanoTime();
		System.out.println("Time taken by StringBuffer class: " + (startTime - endTime) + " ms");
	}

}
