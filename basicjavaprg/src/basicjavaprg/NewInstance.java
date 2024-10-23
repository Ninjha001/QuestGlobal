package basicjavaprg;

class SampleClass{
	public void display() {
		System.out.println("Hello from SampleClass");
	}
}
public class NewInstance {

	public static void main(String[] args) {
		try {
			SampleClass sample = new SampleClass();
			String className = sample.getClass().getName();
			System.out.println("Class name : "+className);
			
			Class<?> clazz = Class.forName(className);
			Object obj = clazz.getDeclaredConstructor().newInstance();
			
			SampleClass newSample = (SampleClass) obj;
			newSample.display();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
