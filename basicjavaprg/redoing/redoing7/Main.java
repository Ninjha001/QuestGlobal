package redoing7;



public class Main {

	public static void main(String[] args) {
		Product p = new Product("ID20034", "IPAD", 60000, 4);
		Customer c = new Customer("C53368", "ANANDA NARAYANAN", "narayana@gmail.com");
		Order o = new Order("O5753", c);
		
		System.out.println();
		System.out.println("Product Details");
		System.out.println("---------------");
		p.displayProduct();
//		o.addItems(p, 2);
//		System.out.println();
//		System.out.println("Updated Product Details in Inventory after Placing Order");
//		System.out.println("---------------");
//		p.displayProduct();
		System.out.println();
		System.out.println("Customer Details");
		System.out.println("----------------");
		c.displayCustomer();
		System.out.println();
		System.out.println("Order Details");
		System.out.println("-------------");
		o.displayOrder();
		System.out.println("Total price of the Order: $" + o.calculateTotal());
//		o.removeItem(p, 1);
//		System.out.println();
//		System.out.println("Updated Product Details in Inventory after Removal of Order");
//		System.out.println("---------------");
//		p.displayProduct();
		
		o.addItems(p, 5);
	}

}
