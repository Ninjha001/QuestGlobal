package employeemngmntsystem;

//import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println();
		FullTimeEmployee fte = new FullTimeEmployee("FTE1000","Sooryakanth", 400000,15000);
		PartTimeEmployee pte = new PartTimeEmployee("PTE2000", "Ruchika", 350000, 10, 500);
		Contractor c = new Contractor("C1087","Tivari",50000);
		
		//ArrayList<Payeable> payeable = new ArrayList<>();
		//payeable.add(fte);
		//payeable.add(pte);
		//payeable.add(c);
		
		Payeable[] payeable = {fte,pte,c};
		
		/*for( Payeable employee : payeable ) {
				Employee emp = (Employee) employee;   //This gave me ClassCastException because i was trying to cast by implementing the Contractor class to Employee as Contractor implements only Payeable and not Employee
				emp.displayDetails();
				emp.calculateSalary();
				System.out.println();
		}*/
		
		for( Payeable employee : payeable ) {
			if(employee instanceof Employee) {
				Employee emp = (Employee) employee;
				emp.displayDetails();
				emp.calculateSalary();
				System.out.println();
			}else if(employee instanceof Contractor) {
				Contractor con = (Contractor) employee;
				con.displayDetails();
				con.calculateSalary();
				System.out.println();
			}
		}
	}

}
