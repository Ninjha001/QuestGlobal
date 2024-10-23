package ecommerce;

public class Main {

	public static void main(String[] args) {
		Product p =new Product("P45","A/C",3000,20);
		Customer c = new Customer("C342","Sruthilaya","layasruthi@gmail.com");
		Order o = new Order("O21",c);
		
		o.addItem(p, 10);
		System.out.print("Total price of the order: "+o.calculateTotal());
		System.out.println();
		o.removeItem(p, 29);
	}

}
