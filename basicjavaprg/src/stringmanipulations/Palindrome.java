package stringmanipulations;

public class Palindrome {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Malayalam");
		String s1 = new String(sb1);
		StringBuffer sb2 = new StringBuffer(sb1.reverse());
		String s2 = new String(sb2);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
	}
}
