package stringmanipulations;

public class Concatenate {

	public static void main(String[] args) {
		String s1 = new String("ashok");
		String s2 = new String("bhaskar");
		s1 = s1.concat(s2);
		System.out.println(s1);
		String s3 = new String("software");
		s1 = s1.concat(s3);
		System.out.println(s1);
	}

}
