package redoing7;

import java.util.HashMap;
import java.util.Map;

public class Order{
	private String orderId;
	private Customer customer;
	private Map<Product,Integer> items;
	
	public Order(String orderId, Customer customer) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.items = new HashMap<Product, Integer>();
	}

	public String getOrderId() {
		return orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Map<Product, Integer> getItems() {
		return items;
	}
	
	public void addItems(Product product,int quantity) {
		if(quantity<0) {
			System.out.println("Quantity must be positive");
			return;
		}
		if(product.getQuantity()<quantity) {
			System.out.println("Insuffient product in inventory");
			return;
		}
		items.put(product, items.getOrDefault(product, 0)+quantity);
		product.setQuantity(product.getQuantity()-quantity);
	}
	
	public void removeItem(Product product,int quantity) {
		if(!items.containsKey(product)) {
			System.out.println("Product not found in order");
			return;
		}
		
		int currentQuantity = items.get(product);
		if(quantity <=0 || currentQuantity<quantity) {
			System.out.println("Insuffient quantity in order");
			return;
		}
		if(quantity == currentQuantity) {
			items.remove(product);
			System.out.println("Order has been removed");
		}
		else {
			items.put(product, currentQuantity - quantity);
			System.out.println("Quantity has been removed from order");
		}
		product.setQuantity(product.getQuantity()+quantity);
	}
	
	public double calculateTotal() {
		double total = 0.0;
		for(Map.Entry<Product, Integer> list : items.entrySet()) {
			total += list.getKey().getPrice() * list.getValue();
		}
		return total;
	}
	
	public void displayOrder() {
		System.out.println("Order Id: " + orderId);
	}
}