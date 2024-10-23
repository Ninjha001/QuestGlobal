package basicjavaprg;

class Initialization {
	private static String methodOne(String msg) {     //control starts from the static block. (1)
		System.out.println(msg);
		return msg;
	}
	Initialization(){
		m = methodOne("1");   //(9)
	}
	//(5)
	{
		m = methodOne("2");   //(7)
	}
	//(6)
	String m = methodOne("3");  //(8)
	public static void main(String[] args) {          //(2)  
		Object obj = new Initialization();            //(4)  
	}

}
