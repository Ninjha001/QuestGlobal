/*
 * package customexceptions;
 * 
 * class TooOldException extends RuntimeException{ TooOldException(String s){
 * super(s); } }
 * 
 * class TooYoungException extends RuntimeException{ TooYoungException(String
 * s){ super(s); } }
 * 
 * public class Demo2 { public static void main(String[] args) { int age =
 * Integer.parseInt(args[0]); if(age>=60) { throw new
 * TooOldException("You are too old for marriage"); } else if(age < 18) { throw
 * new TooYoungException("You are too young for marriage"); } else {
 * System.out.println("You are of right age for marriage"); } } }
 */