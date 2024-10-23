package ecommerceeg2;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("P345", "A/C", 25000, 4);
        Order o = new Order(p1,"C234", "Sruthilaya", "layasruthi@gmail.com", "Aalayam, HouseNo 38, Chempaka Nagar, Iriveri, Kannur", "O46757");
        System.out.println(); 
        o.addItem(p1, 2); // Order 2 A/Cs
        System.out.println(o.toString());
        System.out.println();
        //Trying to order more than available
        o.addItem(p1, 3); // Try to order 3 more A/Cs
        
        /*Product p2 = new Product("P567", "Refrigerator", 100000, 3);
        Order o1 = new Order(p2,"C234", "Sruthilaya", "layasruthi@gmail.com", "Aalayam, HouseNo 38, Chempaka Nagar, Iriveri, Kannur", "O46757");
        o1.addItem(p2, 1); // Order 1 Refrigerator
        System.out.println(o1.toString());
        System.out.println();
        Trying to order more than available
        o.addItem(p1, 3); // Try to order 3 more A/Cs*/
	}

}
