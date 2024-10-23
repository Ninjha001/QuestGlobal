package methods;

public class Teacher {
	private String name;
	private int rollNo;
	
	Teacher(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public boolean equals(Object obj) {
		try {
			String name1 = this.name;
			int rollNo1 = this.rollNo;
			Teacher t1 = (Teacher) obj;
			String name2 = t1.name;
			int rollNo2 = t1.rollNo;
			if(name1.equals(name2) && rollNo1==rollNo2 ) {
				return true;
			}else {
				return false;
			}
		}
		catch(ClassCastException | NullPointerException e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Ashwathy",37);
		Teacher t2 = new Teacher("Hridhvarsh",45);
		Teacher t3 = new Teacher("Ashwathy",37);
		Teacher t4 = t3;
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equals(t3));
		System.out.println(t3.equals(t4));
		System.out.println(t1.equals("Ashwathy"));
		System.out.println(t1.equals(null));
	}
}
