package basicjavaprg;

public class SwitchExample {

	public static void main(String[] args) {
		int x = 10;
		/*switch(x) {
		System.out.println("Hello");
		}*/
		//final int y = 20;
		int y = 20;
		/*switch(x) {
		case 10:
			System.out.println(x);
			//break;
		case 20:
			System.out.println(y);
			//break;
		case y:
			System.out.println(y);
		}*/
		/*switch(x+1) {
		case 10:
		case 10+20:
		case 10+20+30:
		case 11:
			System.out.println("Hello");
		}*/
		byte b = 10;
		/*switch(b) {
		case 10:
			System.out.println("Neerja");
			//break;
		case 100:
			System.out.println("Binu");
			//break;
		case 101:
			System.out.println("Vimalan");
			//break;
		}*/ 
		/*switch(b+1) {
		case 11:
			System.out.println("Neerja");
			break;
		case 100:
			System.out.println("Binu");
			break;
		case 1000:
			System.out.println("Vimalan");
			break;
		default :
			System.out.println("Neerja Binu Vimalan");
		}*/
		switch(x) {
		case 97:
			System.out.println("97");
		case 99:
			System.out.println("99");
		case 'A':
			System.out.println("100");
		default :
			System.out.println("Orakammm varunindoo?");
		}
		
	}
}
