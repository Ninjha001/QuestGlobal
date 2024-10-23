package redoing3;
import java.util.List;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		FullTimeEmployee f = new FullTimeEmployee("FTE13452", "SURESH", 60000, 7000);
		PartTimeEmployee p = new PartTimeEmployee("PTE6578", "RAJANI", 0, 20, 1000);
		Contractor c = new Contractor("C687467", "KRISHNAN", 100000);
		
		List<Payable> payables = new ArrayList<>();
		payables.add(f);
		payables.add(p);
		payables.add(c);
		
		for(Payable item : payables) {
			if(item instanceof Employee) {
				Employee emp = (Employee) item;
				emp.displayDetails();
				emp.calculateSalary();
				System.out.println();
			}
			else if(item instanceof Contractor) {
				Contractor con = (Contractor) item;
				con.displayDetails();
				con.calculateSalary();
				System.out.println();
			}
		}
	}

}
