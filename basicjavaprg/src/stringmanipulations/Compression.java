package stringmanipulations;

public class Compression {

	public static void main(String[] args) {
		String s1 = new String("AABBBBBBCDEEEAAAABC");
		String s2 = compressString(s1);
		System.out.println("Original String: " + s1);
		System.out.println("Compressed String: " + s2);
	}
	
	private static String compressString(String s) {
		if(s==null || s.isEmpty()) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
			else {
				sb.append(s.charAt(i-1));
				if(count>=2) {
					sb.append(count);					
				}
				count=1;
			}
		}
		sb.append(s.charAt(s.length()-1));
		if(count>=2) {
			sb.append(count);			
		}
		
		return sb.toString();
	}
}
