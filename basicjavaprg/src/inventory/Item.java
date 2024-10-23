package inventory;

public class Item {
	
	private String itemName;
	private int quantity;
	private double price;
	
	public Item(String itemName, int quantity, double price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	
	public void decrementQuantity(int amount) {
		quantity-=amount;
	}
}
