package stringmanipulations;

public class Wrapping {                       //aligns only the left edges, the right edges are ragged

	public static void main(String[] args) {
		String text = new String("This line is very lengthy, so I would like to wrap it to a specific width");
		int wrapLength = 10;
		String wrappedText = wrapText(text,wrapLength);
		System.out.println(wrappedText);
	}
	
	private static String wrapText(String text, int maxLineLength) {
		StringBuilder sb = new StringBuilder();
		String[] words = text.split(" ");
		int currentLineLength=0;
		for(String word : words) {
			if(currentLineLength + word.length() > maxLineLength) {
				sb.append("\n");
				currentLineLength = 0;
			}
			sb.append(word).append(" ");
			currentLineLength += word.length() + 1;
		}
		return sb.toString().trim();
	}

}

//we can use external libraries like org.apache.commons.text.WordUtil. It has an inbuilt method for text wrapping.
