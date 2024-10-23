package InterfaceExamples;

//class Three implements One extends Two    is an incorrect syntax for java statements.Hence won't produce any desirable outputs.
class Three extends Two implements One{
	public void methodOne() {
		System.out.println("Three implementation of MethodOne");
	}
	public static void main(String[] args) {
		Two t = new Three();
		t.methodTwo();
		Three t1 = new Three();
		t1.methodOne();
	}
}
