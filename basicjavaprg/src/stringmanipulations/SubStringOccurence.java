package stringmanipulations;

public class SubStringOccurence {
	public static void main(String[] args) {
		String s1 = new String("Malayalam  alayalam");
		String s2 = new String("mm");
		
		int subStringIndex = s1.toLowerCase().indexOf(s2.toLowerCase());
		
		if(subStringIndex != -1) {
			System.out.println("Sub String first appeared at index " + subStringIndex);
		}
		else {
			System.out.println("Sub String not found.");
		}
	}
}
