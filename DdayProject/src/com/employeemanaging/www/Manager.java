package com.employeemanaging.www;
import java.util.*;
public class Manager implements Comparator<Employee>{
	private Set<Employee> employees;

	public Manager() {
		super();
		this.employees = new HashSet<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		if(!employees.add(employee))
			throw new DuplicateEmployeeException("Duplicate already exists!");
		System.out.println("Employee added successfully!");
	}
	
	public void removeEmployee(String employeeId) {
		Employee removeEmployee = findEmployeeById(employeeId);
		if(removeEmployee == null)
			throw new EmployeeNotFoundException("Employee doesn't exist!");
		employees.remove(removeEmployee);
	}
	
	public void updateEmployeeDetails(String name, String newDepartment, double newSalary) {
		Employee updateEmployee = findEmployeeByName(name);
		if(updateEmployee == null)
			throw new EmployeeNotFoundException("Employee doesn't exist!");
		else {
			updateEmployee.setDepartment(newDepartment);
			updateEmployee.setSalary(newSalary);
			System.out.println("Employee details updated succeessfully!");
		}
	}
	
	public void display() {
		List<Employee> employeeList = new ArrayList<Employee>(employees);
		Collections.sort(employeeList,this);
		for(Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
	
	public void calculateSalary(String department) {
		List<Employee> employeeListByDepartment = new ArrayList<Employee>();
		double totalSalary = 0.0;
		int count = 0;
		for(Employee employee : employees) {
			if(employee.getDepartment().equalsIgnoreCase(department)) {
				employeeListByDepartment.add(employee);
				totalSalary =+ employee.getSalary();
				++count;
			}
		}
		System.out.println("Total Salary: " + totalSalary);
		System.out.println("Average Salary: " + (totalSalary/count));
	}
	
	public Employee findEmployeeByName(String name) {
		for(Employee employee : employees) {
			if(employee.getName().equalsIgnoreCase(name))
				return employee;
		}
		return null;
	}
	
	public Employee findEmployeeById(String employeeId) {
		for(Employee employee : employees) {
			if(employee.getEmployeeId().equals(employeeId))
				return employee;
		}
		return null;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);
	}
}
