package ecommerceeg2;

import java.util.ArrayList;

public class Order extends Customer {
    private String orderId;
    private ArrayList<Product> items;
    private ArrayList<Integer> quantities;

    public Order(Product p,String customerId, String name, String email, String shippingAddress, String orderId) {
        super(p,customerId,name,email,shippingAddress);
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public ArrayList<Product> getItems() {
        return items;
    }

    public void addItem(Product product, int quantity) {
        System.out.println("Available Quantity for " + product.getProductName() + ": " + product.getQuantity());
        System.out.println("Requested Quantity: " + quantity);

        if (product.getQuantity() >= quantity) {
            product.decreaseQuantity(quantity); // Decrease available quantity
            items.add(product);
            quantities.add(quantity);
            System.out.println("Added " + quantity + " of " + product.getProductName() + " to the order.");
        } else {
            System.out.println("Not enough quantity available for " + product.getProductName());
        }
    }

    public void removeItem(Product product) {
        int index = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProductId().equals(product.getProductId())) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Product removedProduct = items.remove(index);
            removedProduct.setQuantity(removedProduct.getQuantity() + 1);
            quantities.remove(index);
        } else {
            System.out.println("Product not found in the order.");
        }
    }

    public double calculateTotal() {
    	double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Details:\n")
          .append("Order ID: ").append(orderId).append("\n")
          .append("Customer Name: ").append(getName()).append("\n")
          .append("Customer Email: ").append(getEmail()).append("\n")
          .append("Shipping Address: ").append(getShippingAddress()).append("\n")
          .append("Items:\n");

        for (int i=0;i<items.size();i++) {
            sb.append(items.get(i).toString()).append("\n");
            sb.append("Quantity Ordered: ").append(quantities.get(i)).append("\n"); // Print quantity ordered
        }

        sb.append("Total cost of order: $").append(calculateTotal());
        return sb.toString();
    }
}