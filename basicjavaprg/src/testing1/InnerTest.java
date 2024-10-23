package testing1;

import testing.OuterTest;

class InnerTest extends OuterTest {
	public static void main(String[] args) {
		InnerTest innerTest = (InnerTest) new OuterTest(10,20);
		System.out.println(innerTest.num1);
		System.out.println(innerTest.num2);
	}
	
}
