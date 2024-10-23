package onlineshoppingsystem;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    // Static block to print a message when the class is loaded
    static {
        System.out.println("ShoppingCart class static block executed.");
    }

    // Instance field to store a list of Product objects
    private List<Product> products;

    // Constructor
    public ShoppingCart() {
        this.products = new ArrayList<>();
        System.out.println("ShoppingCart constructor executed.");
    }

    // Method to add a product to the cart
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Adding product: " + product.getProductName() + " to cart.");
    }

    // Method to remove a product from the cart by productId
    public void removeProduct(int productId) {
        products.removeIf(product -> product.getProductId() == productId);
        System.out.println("Removing product with ID: " + productId + " from cart.");
    }

    // Method to display all products in the cart
    public void displayCartProducts() {
        for (Product product : products) {
            product.displayProductDetails();
        }
    }
}
