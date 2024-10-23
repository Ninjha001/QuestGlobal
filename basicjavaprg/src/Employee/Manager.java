package Employee;

public class Manager extends Employee {
	public double rate = 0.20;
	Manager(String name,double baseSalary){
		super(name,baseSalary);
	}
	
	public void calculateSalary() {
		double managerSalary = baseSalary+(rate*baseSalary);
		System.out.println("Total Salary for Manager "+name+" is $"+managerSalary);
	}
}
