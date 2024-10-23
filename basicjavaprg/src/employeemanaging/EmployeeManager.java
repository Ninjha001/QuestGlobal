package employeemanaging;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmployeeManager {
	private TreeSet<Employee> treeset;
	
	public EmployeeManager(){
		this.treeset = new TreeSet<Employee>();
	}
	
	public void addEmployee(Employee e) {
		if(!treeset.add(e))
			throw new DuplicateEmployeeException("Employee with " +e.getEmployeeID()+" already exists");
	}
	
	public void removeEmployeeByName(String name) {
		Employee employeeToRemove = findEmployeeByName(name);
		if(employeeToRemove == null)
			throw new EmployeeNotFoundException("Employee under the name "+name+" does not exist!");
		String employeeId = employeeToRemove.getEmployeeID();
		Employee removeEmployee = findEmployeeById(employeeId);
		if(removeEmployee!=null) {
			treeset.remove(removeEmployee);
			System.out.println("Employee with employee ID "+employeeId+" has been removed successfully!");
		}
		
	}
	
	public Employee findEmployeeByName(String name) {
		for(Employee employee : treeset) {
			if(employee.getEmployeeID().equals(name))
				return employee;
		}
		return null;
	}
	
	public Employee findEmployeeById(String Id) {
		for(Employee employee : treeset) {
			if(employee.getEmployeeID().equals(Id)) 
				return employee;
		}
		return null;
	}
	
	public void updateEmployee(String name, String department, double salary) {
		Employee employee = findEmployeeByName(name);
		employee.setDepartment(department);
		employee.setSalary(salary);
	}
	
	List<Employee> employees = new ArrayList<Employee>(treeset);
	
	public void salary(String department) {
		double totalSalary=0.0;
		int count = 0;
		for(Employee employee:employees) {
			totalSalary+=employee.getSalary();
			++count;
		}
		System.out.println("Total salary: $" +totalSalary);
		System.out.println("Average salary: $" +(totalSalary/count));
	}
}
