package customexceptions;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
	TooYoungException(String s){
		super(s);
	}
}
class TooOldException extends RuntimeException{
	TooOldException(String s){
		super(s);
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		try{
			if(age > 60) {
				throw new TooOldException("You are too old for marriage");
			}
			else if(age < 18) {
				throw new TooYoungException("You are too young for marriage");
			}
			else if(age>18 && age<30) {
				System.out.println("You are at the right age for marriage");
			}
		}
		finally{
			scanner.close();
		}
	}
	
}
