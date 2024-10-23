package singletonpackage;

class Test {
	private static Test test = null;
	private Test() {}
	public static Test getTest() {
		if(test==null) 
			test = new Test();
		return test;
	}
}

public class SingleTonDemo{
	public static void main(String[] args) {
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
	}
}
