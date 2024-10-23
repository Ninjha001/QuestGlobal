package stringmanipulations;

import java.io.UTFDataFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLRegularExpression {
    public static void main(String[] args) {
        
        String html = "<html><body><h1 class=\"header\">Welcome</h1><p>This is a paragraph.</p><br /></body></html>";

        
        String regex = "<\\/?([a-zA-Z]+)[^>]*>";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);


        while (matcher.find()) {
        	System.out.println("Matched tag: " + matcher.group());
        }
    }
}
