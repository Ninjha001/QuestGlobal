package com.employeemanaging.www;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.addEmployee(new Employee("EID4573", "Akash", "History", 50000));
		manager.addEmployee(new Employee("EID977", "Bhaskar", "Polity", 45000));
		manager.addEmployee(new Employee("EID5384", "Nithraliya", "Sociology", 55000));
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Employee");
			System.out.println("2. Remove Employee");
			System.out.println("3. Search for an Employee By Name");
			System.out.println("4. Display all Employees");
			System.out.println("5. Update existing employee");
			System.out.println("6. Exit");
			
			System.out.println("enter the option");
			int option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
			case 1:
				System.out.println("enter the employee id");
				String employeeId = scanner.nextLine();
				System.out.println("enter the employee name");
				String name = scanner.nextLine();
				System.out.println("enter the name department");
				String department = scanner.nextLine();
				System.out.println("enter the salary");
				double salary = scanner.nextDouble();
				try {
					manager.addEmployee(new Employee(employeeId, name, department, salary));
				}
				catch(DuplicateEmployeeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("enter the employee Id");
				String removeEmployeeId = scanner.nextLine();
				try {
					manager.removeEmployee(removeEmployeeId);
				}
				catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("enter the name of the employee to be searched");
				String searchEmployeeName = scanner.nextLine();
				try {
					System.out.println(manager.findEmployeeByName(searchEmployeeName));
				}
				catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				manager.display();
				break;
			case 5:
				System.out.println("enter the name of the employee to be updated");
				String updateEmployeeName = scanner.nextLine();
				System.out.println("enter the new department name");
				String newDepartment = scanner.nextLine();
				System.out.println("enter the new salary");
				double newSalary = scanner.nextDouble();
				scanner.nextLine();
				try {
					manager.updateEmployeeDetails(updateEmployeeName, newDepartment, newSalary);
				}
				catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				System.out.println("Exiting program....");
				scanner.close();
				System.exit(0);
			}
		}
	}

}
