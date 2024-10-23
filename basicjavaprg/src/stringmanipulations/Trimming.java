package stringmanipulations;

public class Trimming {
	public static void main(String[] args) {
		String s = new String("  ashok    bhaskar     ");
		System.out.println("Before trimming " + s.length());
		s = s.trim();
		System.out.println("After trimming " + s.length());
	}
}
