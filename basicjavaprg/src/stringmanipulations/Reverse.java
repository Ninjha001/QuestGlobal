package stringmanipulations;

public class Reverse {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ashok");
		sb = sb.reverse();
		String s = new String(sb);
		System.out.println(s);
	}

}
