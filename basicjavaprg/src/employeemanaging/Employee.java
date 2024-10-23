package employeemanaging;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	private String employeeID;
	private String name;
	private String department;
	private double salary;
	
	public Employee(String employeeID, String name, String department, double salary) {
		super();
		this.employeeID = employeeID.toUpperCase();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [ Employee ID: "+employeeID+ ", Name: "+name+ ", Department: "+department+ ", Salary: $" +salary+" ]";
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || getClass()!=obj.getClass())
			return false;
		Employee employee = (Employee)obj;
		return employeeID.equalsIgnoreCase(employee.employeeID);
	}
	
	public int hashCode() {
		return Objects.hash(employeeID);
	}

	@Override
	public int compareTo(Employee o) {
		String id1 = this.employeeID;
		String id2 = o.employeeID;
		return id1.compareTo(id2);
	}
	
	
}
