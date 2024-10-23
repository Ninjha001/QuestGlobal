package stringmanipulations;

public class RLE{
	public static void main(String[] args) {
		String input = "ABBCCCDDDDEEEEEFFGDS";
		String compressedString = compressionRLE(input);
		System.out.println(compressedString);
		System.out.println(input.length());
		System.out.println(compressedString.length());
	}
	
	private static String compressionRLE(String input) {
		if(input==null || input.isEmpty()) {
			return input;
		}
		StringBuilder s = new StringBuilder();
		int count =1;
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i)==input.charAt(i-1)) {
				count++;
			}
			else {
				s.append(input.charAt(i-1));
				if(count>=3) {
					s.append(count);
				}
				else {
					for(int j=0;j<count-1;j++) {
						s.append(input.charAt(i-1));
					}
				}
				count =1;
			}
		}
		
		s.append(input.charAt(input.length()-1));
		if(count>=3) {
			s.append(count);
		}
		return s.toString();
	}
}