package Employee;

public class Developer extends Employee {
	public double rate = 0.10;
	Developer(String name,double baseSalary){
		super(name,baseSalary);
	}

	void calculateSalary() {
		double developerSalary = baseSalary+(rate*baseSalary);
		System.out.println("Total Salary for Developer "+name+" is $"+developerSalary);
	}
}
