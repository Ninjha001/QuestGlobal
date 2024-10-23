package stringmanipulations;

public class CompressionString {
	public static void main(String[] args) {
		String s = new String("ABBCCCDDDDAAAAAAAAAAAA");
		int l = s.length();
		char[] arr2 = new char[l] ;
		int count=1;
		int index=0;
		for(int i=1;i<l;i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				++count;
			}
			else {
				arr2[index++]=s.charAt(i-1);
				if(count>=2) {
					char[] countChars = String.valueOf(count).toCharArray();    // this first converts the count to string and then to char[] so that if the value is 1more than 9 lets say 12, it will be split into 1 and 2 and stored.
					for(char c : countChars) {
						arr2[index++] = c;
					}
				}
				count=1;
			}
		}
		arr2[index++] = s.charAt(l-1);
		if(count>=2) {
			char[] countChars = String.valueOf(count).toCharArray();
			for(char c : countChars) {
				arr2[index++] = c;
			}
		}
		System.out.println(arr2);
	}
}		
