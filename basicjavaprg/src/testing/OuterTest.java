package testing;

public class OuterTest{
	protected int num1;
	protected int num2;
	public OuterTest(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public OuterTest(){
		this.num1=num1;
		this.num2=num2;
	}
	protected void methodOne() {
		System.out.println("Method One");
	}
}