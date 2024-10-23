package methods;

public class Student {
	private String name;
	private int rollNo;
	
	Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Arabhi",16);
		Student s2 = new Student("Bhaskar",45);
		Student s3 = new Student("Keerthana", 29);
		Student s4 = s3;
		
		String line1 = new String("HAI");
		String line2 = new String("hai");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(s1==s2);
//		System.out.println(s4==s3);
		
		System.out.println(line1.equals(line2));
		
//		System.out.println(line1==line2);
		
	}
}
