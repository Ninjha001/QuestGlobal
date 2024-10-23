package movietheatre;
import java.util.Scanner;
public class MovieTicketingSystem {
	
	public double calculateTotalCost(int noOfTickets,double ticketPrice) {
		double tc = noOfTickets*ticketPrice;
		System.out.println("Total cost before overloading the method: $"+tc);
		return tc;
	}
	
	public double calculateTotalCost(int childTickets,int adultTickets,int seniorTickets,double childPrice,double adultPrice,double seniorPrice) {
		double tc = (childTickets*childPrice)+(adultTickets*adultPrice)+(seniorTickets*seniorPrice);
		System.out.println("Total cost after overloading the method: $"+tc);
		return tc;
	}
    
    public static void main(String[] args) {
    	
    	double totalCost;
    	
        Scanner scanner = new Scanner(System.in);
        MovieTicketingSystem system = new MovieTicketingSystem();
        
        System.out.println("Enter the total number of tickets: ");
        int noOfTickets = scanner.nextInt();
        System.out.println("Enter the price of one ticket: ");
        double ticketPrice = scanner.nextDouble();
        
        totalCost = system.calculateTotalCost(noOfTickets,ticketPrice);
        
        
        System.out.print("Enter the number of child tickets: ");
        int childTickets = scanner.nextInt();
        System.out.print("Enter the number of adult tickets: ");
        int adultTickets = scanner.nextInt();
        System.out.print("Enter the number of senior tickets: ");
        int seniorTickets = scanner.nextInt();
        
		
		System.out.print("Enter the price for child tickets: "); 
		double childPrice = scanner.nextDouble();
		System.out.print("Enter the price for adult tickets: "); 
		double adultPrice = scanner.nextDouble();
		System.out.print("Enter the price for senior tickets: "); 
		double seniorPrice = scanner.nextDouble();
		 
		Customer childCustomer = new ChildCustomer();
	    Customer adultCustomer = new AdultCustomer();
	    Customer seniorCustomer = new SeniorCustomer();
	        
	        
		/*
		 * System.out.println("Enter the type of movie: "); String movieType =
		 * scanner.next(); double childPrice = childCustomer.getTicketPrice(movieType);
		 * double adultPrice = adultCustomer.getTicketPrice(movieType); double
		 * seniorPrice = seniorCustomer.getTicketPrice(movieType);
		 */
		 
        
        double totalDiscount = 0.00;
        
        double cost1 = childPrice - (childCustomer.getDiscount() * childPrice);
        System.out.println("Child ticket discount: $"+cost1);
        totalDiscount += cost1 * childTickets;
        
        double cost2 = adultPrice - (adultCustomer.getDiscount() * adultPrice);
        System.out.println("Adult ticket discount: $"+cost2);
        totalDiscount += cost2 * adultTickets;
        
        double cost3 = seniorPrice - (seniorCustomer.getDiscount() * seniorPrice);
        System.out.println("Senior ticket discount: $"+cost3);
        totalDiscount += cost3 * seniorTickets;
       
        totalCost = system.calculateTotalCost(childTickets, adultTickets, seniorTickets, childPrice, adultPrice, seniorPrice);
        
        double finalCost = totalCost - totalDiscount;
        System.out.println("Total discount: $"+totalDiscount);
        System.out.println("Final total cost after discount: $"+finalCost);
        
        scanner.close();
    }
}
