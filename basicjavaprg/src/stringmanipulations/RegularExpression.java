package stringmanipulations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpression {

	public static void main(String[] args) {
		String[] texts = {
				"JavaProgramming",
				"Java programming",
	            "Java Programming",
				"Java is fun and Programming",
	            "I love Java Programming",
	            "Java is the best Programming language",
	            "Java is awesome but not Programming",
	            "Programming with Java is great"
	        };
		
		String pattern = "^Java.*Programming$";                                   //^ means starting, .* means any number of things can come, countless times, $ means its the limiting character or end of the string
		
		Pattern regex = Pattern.compile(pattern);
		
		for(String text : texts) {
			Matcher matcher = regex.matcher(text);
			if(matcher.matches()) {
				System.out.println("Matches: " + text);
			}
			else {
				System.out.println("Doesnt Not Match: " + text);
			}
		}
		
	}

}
