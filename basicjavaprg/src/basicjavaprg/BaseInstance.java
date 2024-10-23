package basicjavaprg;

class BaseInstance {
	int x = 10;
	{
		methodOne();
		System.out.println("Parent First Instance Block");
	}
	BaseInstance(){
		System.out.println("Parent Constructor");
	}
	public static void main(String[] args) {
		BaseInstance base = new BaseInstance();
		System.out.println("Parent Main");
	}
	public void methodOne() {
		System.out.println(y);
	}
	int y = 20;
}
