package stringmanipulations;

public class Tokenizing {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("I am,a genius/invention");
		int i=0;
		int l = s.length();
		while(i<l) {
			StringBuilder sb = new StringBuilder();
			while(i<l && s.charAt(i) != ' ' && s.charAt(i) != ',' && s.charAt(i) != '/') {
				sb.append(s.charAt(i));
				i++;
			}
			if(sb.length()>0) {
				System.out.println(sb.toString());
			}
			while(i<l && (s.charAt(i)==' ' || s.charAt(i)==',' || s.charAt(i)=='/')) {
				i++;
			}
		}
	}
}
