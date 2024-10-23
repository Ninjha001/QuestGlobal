package Employee;

public abstract class Employee {
	protected String name;
	protected double baseSalary;
	
	Employee(String name, double baseSalary){
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	abstract void calculateSalary();
	
	void getDetails(){
		System.out.println();
		System.out.println("Employee's Name: "+name);
		System.out.println("Employee's Base Salary :"+baseSalary);
	}
}
