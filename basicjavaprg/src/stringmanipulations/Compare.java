package stringmanipulations;

public class Compare {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("jAVa");
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("EQUAL");
		}
		else {
			System.out.println("NOT EQUAL");
		}
	}
}
