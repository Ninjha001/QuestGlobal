package Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		Manager manager = new Manager("Karthik",30000);
		Developer developer = new Developer("Sreejith",26000);
		Intern intern = new Intern("Ujjain",15000);
		
		manager.getDetails();
		manager.calculateSalary();
		
		developer.getDetails();
		developer.calculateSalary();
		
		intern.getDetails();
		intern.calculateSalary();
		
	}

}
