package ecommerceeg2;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity=quantity;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }
    
    public void decreaseQuantity(int amount) {
        if (amount <= quantity) {
            this.quantity -= amount;
        } else {
            System.out.println("Not enough quantity available.");
        }
    }
    
    public String toString() {
        return "Product Details:\n"
                + "Product ID: " + productId + "\n"
                + "Product Name: " + productName + "\n"
                + "Price per commodity: $" + price + "\n";
    }
}
