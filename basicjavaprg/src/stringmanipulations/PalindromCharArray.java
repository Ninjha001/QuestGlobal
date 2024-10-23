package stringmanipulations;

public class PalindromCharArray {
	public static void main(String[] args) {
		String s = new String("Mayam");
		s = s.toLowerCase();
		int l = s.length();
		char[] arr = s.toCharArray();
		boolean isPalindrome=true;
		for(int i=0;i<l/2;i++) {
			if(arr[i]!=arr[l-i-1]) {
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
	}
}
