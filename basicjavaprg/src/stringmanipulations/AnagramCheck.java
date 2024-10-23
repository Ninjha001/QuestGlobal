package stringmanipulations;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1 = new String("listen");
		String s2 = new String("SIAENT");
		
		if(s1.length() == s2.length()) {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("ANAGRAMS");
			}
			else {
				System.out.println("NOT ANAGRAMS");
			}
		}
		else {
			System.out.println("NOT ANAGRAMS");
		}
	}

}
