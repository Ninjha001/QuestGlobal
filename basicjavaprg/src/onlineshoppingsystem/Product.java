package onlineshoppingsystem;

class Product {
    // Static field
    private static int totalProducts = 0; // Tracks total number of products created

    // Instance fields
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Static block to initialize static variables and print a message
    static {
        System.out.println("Product class static block executed.");
    }

    // Instance initialization block
    {
        System.out.println("Product instance initialization block executed.");
    }

    // Constructor
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
        System.out.println("Product constructor executed for product: " + productName);
    }

    // Static method to get total products
    public static int getTotalProducts() {
        return totalProducts;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product details: " + productName + ", $" + price + ", Quantity: " + quantity);
    }

    // Instance method to update quantity
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
        System.out.println("Updated quantity for product: " + productName + " to " + newQuantity);
    }

    // Getter methods for productId and productName
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}