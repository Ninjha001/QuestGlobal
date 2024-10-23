package employeemngmntsystem;

public abstract class Employee implements Payeable{
	public String employeeId;
	public String name;
	public double basicSalary;
	
	public Employee(String employeeId,String name,double basicSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Employee name: "+name);
	}
	
}
