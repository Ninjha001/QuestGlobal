package basicjavaprg;

class Example{
	//final int i;  //unresolved compilation problem.
	//final int i = 10; //no error in this case as it has been initialised explicitly.
	/*final int i;
	{
		i = 20;        //no error as it has been initialised inside an instance block.
	}*/
	final int i;
	Example(){
		i = 30;      //no error as it has been initialised inside a constructor.
	}
	/*final int i;
	public void method() {
		i = 40;            //since it is being initialised inside the function, it is not possible and hence it will produce an error.
	}*/
}


public class InstanceVariable {
	
	public static void main(String[] args) {
		Example o = new Example();
		System.out.println(o.i);
	}

}
