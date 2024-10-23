package stringmanipulations;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.net.URI;
public class URLRegularExpression {

	public static void main(String[] args) {
		String text = "If you're connection is not secure at http://www.yoyodyne.com/pub/files/foobar.html?key=value&name=test then switch to  http://www.yoyodyne.com:1234/pub/files/foobar.html";
		
		String url = "(https?:\\/\\/[^\\s]+)";
		
		Pattern pattern = Pattern.compile(url,Pattern.CASE_INSENSITIVE);   //this helps me to match the uppercase variants like HTTP and HTTPs in addition to the lowercase variants
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			String foundURL = matcher.group();
			System.out.println("Found URL: " + foundURL);
			try {
				URI urlObj = new URI(foundURL);          //i used URI, because 20 and above versions have deprecated the constructor formation for URL class, instead a more holistic approach is URI as it can handle both URl and URi
				
				String domainName = urlObj.getHost();
				String path = urlObj.getPath();
				String query = urlObj.getQuery();
				int portNo = urlObj.getPort();
				
				System.out.println("Domain Name: " + domainName);
				System.out.println("Path: " + path);
				System.out.println("Query: " + query);
				System.out.println("Port Number: " + portNo);
				System.out.println();
			}
			catch(Exception e) {
				System.out.println("Invalid URL");
			}
		}
	}

}
