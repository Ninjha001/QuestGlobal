package redoing3;

public class Employee implements Payable {
	protected String employeeId;
	protected String name;
	protected double basicSalary;
	
	Employee(String employeeId,String name,double basicSalary){
		this.employeeId = employeeId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	@Override
	public double calculateSalary() {
		return basicSalary;
	}

	@Override
	public void displayDetails() {
		System.out.println("EMPLOYEE ID: " + employeeId);
		System.out.println("EMPLOYEE NAME: " + name);
	}

}
