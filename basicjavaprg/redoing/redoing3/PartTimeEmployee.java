package redoing3;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String employeeId,String name,double basicSalary,int hoursWorked,double hourlyrate) {
		super(employeeId,name,basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyrate;
	}
	
	public double calculateSalary() {
		basicSalary = hourlyRate * hoursWorked;
		System.out.println("EMPLOYEE SALARY: $ " + basicSalary);
		return basicSalary;
	}
}
