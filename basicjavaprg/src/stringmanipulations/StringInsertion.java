package stringmanipulations;

public class StringInsertion {
	public static void main(String[] args) {
		StringBuilder superString = new StringBuilder("Java Programming Language");
		StringBuilder subString = new StringBuilder("is a");
		int insertAt = superString.indexOf("Programming");
		superString.insert(insertAt, subString);
		System.out.println(superString);
	}
}
