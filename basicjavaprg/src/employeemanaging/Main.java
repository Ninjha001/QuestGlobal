package employeemanaging;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		EmployeeManager manager = new EmployeeManager();
		manager.addEmployee(new Employee("EID85738", "Uthkarsh", "Politics", 40000));
		manager.addEmployee(new Employee("EID54374", "Mili", "History", 50000));
		manager.addEmployee(new Employee("EID5374", "Sarvesh", "Sociology", 45000));
		manager.addEmployee(new Employee("EID43365", "Prathyush", "Geography", 42000));
		
		Scanner scanner  = new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome");
			System.out.println("-------");
			System.out.println("1. Add Employee");
			System.out.println("2. Search an Employee");
			System.out.println("3. Remove an Employee");
			System.out.println("4. Update details");
			System.out.println("5. Display all Employees");
			System.out.println("6. Exit");
			System.out.println();
			System.out.println("Choose an option (1/2/3/4): ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				try {
					System.out.println("Enter the employee Id: ");
					String employeeId = scanner.nextLine();
					System.out.println("Enter the name of the employee: ");
					String name = scanner.nextLine();
					System.out.println("Enter the name of the department: ");
					String department = scanner.nextLine();
					System.out.println("Enter the salary of the employee: ");
					double salary = scanner.nextDouble();
					manager.addEmployee(new Employee(employeeId, name, department, salary));
					scanner.nextLine();
				}
				catch(DuplicateEmployeeException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("Enter the name of the employee to be searched: ");
					String searchName = scanner.nextLine();
					manager.findEmployeeByName(searchName);
				}
				catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3: 
				try {
					System.out.println("Enter the name of the employee to be removed: ");
					
				}
				catch(EmployeeNotFoundException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
