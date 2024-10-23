package stringmanipulations;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodeDecode {
	public static void main(String[] args) {
		String s = new String("Russia is going on war");
		String base64EncodedString = Base64.getEncoder().encodeToString(s.getBytes(StandardCharsets.UTF_8));
		System.out.println("Base64 Encoding");
		System.out.println("---------------");
		System.out.println("Original Message "+ s);
		System.out.println("Encoded Message "+ base64EncodedString);
		
		byte[] decode = Base64.getDecoder().decode(base64EncodedString);
		String base64DecodedString = new String(decode,StandardCharsets.UTF_8);
		System.out.println("Decoded Message: "+base64DecodedString);
		
		
		//there are mechanisms to to encode the string like UTF-8 method.
	}
}
