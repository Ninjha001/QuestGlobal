package Employee;

public class Intern extends Employee {
	Intern(String name,double baseSalary){
		super(name,baseSalary);
	}

	void calculateSalary() {
		double internSalary = baseSalary;
		System.out.println("Total Salary for Intern "+name+" is $"+internSalary);
	}
	
}
