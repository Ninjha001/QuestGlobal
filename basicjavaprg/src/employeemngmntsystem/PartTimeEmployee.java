package employeemngmntsystem;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String employeeId, String name, double basicSalary, int hoursWorked, double hourlyRate) {
		super(employeeId, name, basicSalary);
		//super();
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	/*public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}*/

	public double calculateSalary() {
		double salary = hoursWorked*hourlyRate;
		System.out.println("The salary of a part time employee is "+salary);
		return salary;
	}
}
