package basicjavaprg;

enum Days{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class EnumDemo2 {
	public static void main(String[] args) {
		Days today = Days.Monday;
		switch(today) {
		case Sunday:
			System.out.println("Its a weekend!");
			break;
		case Monday:
			System.out.println("Its a weekstart!");
			break;
		default:
			System.out.println("Its just the middle of a week!");
			break;
		}
	}
	
}
