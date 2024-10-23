package redoing3;

public class FullTimeEmployee extends Employee {
	private double bonus;
	
	public FullTimeEmployee(String employeeId,String name,double basicSalary,double bonus) {
		super(employeeId,name,basicSalary);
		this.bonus = bonus;
	}
	
	public double calculateSalary() {
		System.out.println("Employee Salary: $ " + (basicSalary+bonus));
		return basicSalary + bonus;
	}
}
