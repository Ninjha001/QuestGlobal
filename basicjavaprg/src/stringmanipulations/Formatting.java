package stringmanipulations;

import java.text.MessageFormat;

public class Formatting {
	public static void main(String[] args) {
		String name = "Neerja";
		int age = 24;
		String fString = String.format("My name is %s and I am %d years old.", name,age);   //here the arguments include the string as well as object type variable arguments.
		System.out.println(fString);
		
		//OR
		
		
		String s = "My name is {0} and I am {1} years old.";
		String formattedString = MessageFormat.format(s, "Neerja", 24);    //MessageFormat class
		System.out.println(formattedString);
				
	}
}
