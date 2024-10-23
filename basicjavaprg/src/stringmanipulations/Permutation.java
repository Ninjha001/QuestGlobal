package stringmanipulations;

public class Permutation {
	public static void main(String[] args) {
		String s = "ABC";
		System.out.println("Original String: " + s);
		System.out.println("Permuted String Combinations: " );
		permute(s," ");
	}
	
	private static void permute(String s,String result) {
		if(s.length()==0) {
			System.out.println(result);
			return;
		}
		for(int i=0;i<s.length();i++) {
			char currentChar = s.charAt(i);
			String remainingString = s.substring(0, i) + s.substring(i+1);
			
			permute(remainingString,result+currentChar);
		}
	}
}

