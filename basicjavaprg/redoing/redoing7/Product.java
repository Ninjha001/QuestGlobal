package redoing7;

public class Product {
	private String productId;
	private String name;
	private double price;
	private int quantity;
	
	Product(String productId,String name,double price,int quantity){
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity>=0) {
			this.quantity = quantity;
		}
		else{
			System.out.println("Quantity cannot be negative");
		}
	}
	
	public void displayProduct() {
		System.out.println("Product Id: " + productId);
		System.out.println("Product Name: " + name);
		System.out.println("Product Price: $" + price);
		System.out.println("Inventory Quantity: " + quantity);
	}
	
	
}
