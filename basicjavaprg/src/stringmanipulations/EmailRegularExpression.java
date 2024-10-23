package stringmanipulations;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EmailRegularExpression {

	public static void main(String[] args) {
		String text = "For any further queries, either email at us at snailmamba@gmail.com or snailadministrator@gmail.com";
		
		String email = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		Pattern pattern = Pattern.compile(email);
		
		String[] words = text.split(" ");
		for(String word : words) {
			Matcher matcher = pattern.matcher(word);
			if(matcher.matches()) {
				System.out.println("Found Matches: " + word);
			}
		}

	}

}
