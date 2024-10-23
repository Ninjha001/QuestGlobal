package stringmanipulations;

public class Frequency {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ammu kutty");
		boolean counted[] = new boolean[sb.length()];
		for(int i=0;i<sb.length();i++) {
			if(!counted[i] && sb.charAt(i) != ' ') {
				int count = 1;
				for(int j=i+1;j<sb.length();j++) {
					if(sb.charAt(i)==sb.charAt(j) && sb.charAt(j) != ' ') {
						++count;
						counted[j] = true;
					}
				}
				System.out.println("Count of " + sb.charAt(i) + " is " + count );
			}
		}
	}
}
