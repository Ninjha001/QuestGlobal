package ecommerce;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private String orderId;
    private Customer customer;
    private Map<Product, Integer> items;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new HashMap<>();
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

    public void addItem(Product product, int quantity) {
        if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }
        
        if (product.getQuantity() < quantity) {
            System.out.println("Not enough stock available.");
            return;
        }
        
        items.put(product, items.getOrDefault(product, 0) + quantity);
        product.setQuantity(product.getQuantity() - quantity);
    }

    public void removeItem(Product product, int quantity) {
        if (!items.containsKey(product)) {
            System.out.println("Product not found in the order.");
            return;
        }

        int currentQuantity = items.get(product);
        
        if (quantity <= 0 || quantity > currentQuantity) {
            System.out.println("Invalid quantity to remove.");
            return;
        }
        
        if (quantity == currentQuantity) {
            items.remove(product);
        } else {
            items.put(product, currentQuantity - quantity);
        }
        
        product.setQuantity(product.getQuantity() + quantity);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}
