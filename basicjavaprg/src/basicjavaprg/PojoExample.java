package basicjavaprg;

public class PojoExample {
	private String name;
	private int age;
	
	PojoExample(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	  public String toString() { 
		  return "Student Name: "+ name + " Student Age: "+age; 
		 }
	 
}
