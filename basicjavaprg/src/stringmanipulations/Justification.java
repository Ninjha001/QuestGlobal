package stringmanipulations;

import java.util.ArrayList;
import java.util.List;

public class Justification {

	public static void main(String[] args) {
		String s = "This is a very very long example of a text. Hence it is used for text justification.";
		int maxWidth = 16;
		
		System.out.println("Left Justified");
		System.out.println(leftJustify(s,maxWidth));
		System.out.println();
		System.out.println("Right Justified");
		System.out.println(rightJustify(s,maxWidth));
		System.out.println();
		System.out.println("Center Justified");
		System.out.println(centerJustify(s,maxWidth));
	}
	
	private static String leftJustify(String s,int maxWidth) {
		StringBuilder sb = new StringBuilder();
		String[] words = s.split(" ");
		int lineLength = 0;
		
		for(String word : words) {
			if(lineLength + word.length() > maxWidth) {
				sb.append("\n");
				lineLength = 0;
			}
			if(lineLength>0) {
				sb.append(" ");
			}
			sb.append(word);
			lineLength += word.length() + 1;
		}
		return sb.toString();
	}
	
	private static String rightJustify(String s, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        int lineLength = 0;

        for (String word : words) {
            if (lineLength + word.length() > maxWidth) {
                sb.append("\n"); 
                lineLength = 0; 
            }
            if (lineLength > 0) {
                sb.append(" "); 
            }
            sb.append(word);
            lineLength += word.length() + 1; 
        }

        String justified = sb.toString();
        String[] lines = justified.split("\n");
        StringBuilder s2 = new StringBuilder();

        for (String line : lines) {
            s2.append(String.format("%" + maxWidth + "s%n", line));
        }
        return s2.toString().trim();
    }
	
	private static String centerJustify(String s, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        int lineLength = 0;

        for (String word : words) {
            if (lineLength + word.length() > maxWidth) {
                sb.append("\n"); 
                lineLength = 0; 
            }
            if (lineLength > 0) {
                sb.append(" "); 
            }
            sb.append(word);
            lineLength += word.length() + 1; 
        }

        String justified = sb.toString();
        String[] lines = justified.split("\n");
        StringBuilder s2 = new StringBuilder();

        for (String line : lines) {
            int padding = maxWidth - line.length();
            int leftPadding = padding / 2;
            int rightPadding = padding - leftPadding;

            s2.append(" ".repeat(leftPadding)).append(line).append(" ".repeat(rightPadding)).append("\n");
        }
        return s2.toString().trim();
    }
}
