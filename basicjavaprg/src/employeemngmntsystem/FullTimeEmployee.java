package employeemngmntsystem;

public class FullTimeEmployee extends Employee {
	private double bonus;
	
	public FullTimeEmployee(String employeeId, String name, double basicSalary, double bonus) {
		super(employeeId, name, basicSalary);
		//super();
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double calculateSalary() {
		double salary = basicSalary+bonus;
		System.out.println("The salary of a full time employee is "+salary);
		return salary;
	}
	
}
