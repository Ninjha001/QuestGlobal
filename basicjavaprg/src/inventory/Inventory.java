package inventory;
import java.util.HashMap;
import java.util.Map;
public class Inventory {
	private Map<String, Item> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    public void addItem(Item item) {
        items.put(item.getItemName(), item);
        System.out.println("Item added successfully.");
    }

    public void removeItem(String itemName, int removeQuantity) throws ItemNotFoundException, ItemOutOfStockException {
        if (!items.containsKey(itemName)) {
            throw new ItemNotFoundException("Item not found: " + itemName);
        }
        
        Item item = items.get(itemName);
        
        if (item.getQuantity() == 0) {
            throw new ItemOutOfStockException("Item is out of stock: " + itemName);
        }
        
        if(item.getQuantity()<removeQuantity) {
        	throw new ItemOutOfStockException("Not enough stock available");
        }
        
        item.decrementQuantity(removeQuantity);
        
        
        System.out.println("Item removed successfully.");
    }

    public void checkAvailability(String itemName) throws ItemNotFoundException {
        if (!items.containsKey(itemName)) {
            throw new ItemNotFoundException("Item not found: " + itemName);
        }

        Item item = items.get(itemName);
        System.out.println("Item: " + item.getItemName());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Price per item: $" + item.getPrice());
    }
}
