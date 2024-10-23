package onlinebookstore;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	private Map<Book, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
    }
	
	public void addToCart(Book book) throws OutOfStockException {
        if (book.getQuantity() == 0) {
            throw new OutOfStockException(book.getTitle() + " is out of stock.");
        }
        items.merge(book, 1, Integer::sum);
    }

    public void placeOrder(String address) throws EmptyCartException {
        if (items.isEmpty()) {
            throw new EmptyCartException("Cart is empty. Cannot place an order.");
        }
        System.out.println("Placing order to: " + address);
        items.clear(); 
    }
}
