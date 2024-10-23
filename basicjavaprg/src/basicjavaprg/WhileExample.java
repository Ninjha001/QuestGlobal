package basicjavaprg;

public class WhileExample {

	public static void main(String[] args) {
		/*while(1) {
			System.out.println("Hello");  //expects boolean but has int
		}*/
		
		/*while(true) {
			System.out.println("Hello")  //infinite loop
		}*/
		
		/*while(true) {
			                             //no output. compiles and runs fine.
		}*/
		
		/*while(true)
			int x = 10;*/                //declaring statements cannot be given without {}.
		
		/*while(true) {
			int x  = 10;                    //works fine.
		}*/
		
		/*while(true) {
			System.out.println("Hello");     //unreachable hi.
		}
		System.out.println("Hi");*/
		
		/*while(false) {
			System.out.println("Hello");     //unreachable hello
		}
		System.out.println("Hi");*/
		
		/*int a = 10,b = 20;
		while(a<b) {
			System.out.println("Hello");     //infinite hello loop. but compiler doesn't see any problem, so no error. 
		}
		System.out.println("Hi");*/
		
		/*final int a = 10,b = 20;
		while(a<b) {
			System.out.println("Hello");        //unreachable hi. final variables make the value of variables unchangeable.
		}
		System.out.println("Hi");*/
		
		/*final int a = 10;
		while(a<20) {
			System.out.println("Hello");          //unreachable hi. value of a is final. can't be changed.
		}
		System.out.println("Hi");*/
		
		/*int a = 10;
		while(a<20) {
			System.out.println("Hello");      //infinite times hello.
		}
		System.out.println("Hi");*/
		
		/*System.out.println("Hi");
		while(true) {
			System.out.println("Hello");     //reachable hi and hello for this case.
		}*/
		}

}
