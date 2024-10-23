package basicjavaprg;

public class Student {

	int rollNo;
	String studentName;
	
	public Student(int a, String b) {
		this.rollNo = a;
		this.studentName = b;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(23,"Arya");
		Student s2 = new Student(56,"Pramod");
		System.out.println(s1.rollNo);
		System.out.println(s1.studentName);
		System.out.println(s2.rollNo);
		System.out.println(s2.studentName);
	}

}
