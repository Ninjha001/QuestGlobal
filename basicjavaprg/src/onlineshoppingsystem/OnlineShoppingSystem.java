package onlineshoppingsystem;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Creating instances of Product
        Product laptop = new Product(1, "Laptop", 1000.0, 5);
        Product smartphone = new Product(2, "Smartphone", 500.0, 10);

        // Creating an instance of ShoppingCart
        ShoppingCart cart = new ShoppingCart();

        // Demonstrate adding products to the cart
        cart.addProduct(laptop);
        cart.addProduct(smartphone);

        // Display total products created
        System.out.println("Total products created: " + Product.getTotalProducts());

        // Display product details from the cart
        cart.displayCartProducts();

        System.out.println("Main method ended.");
    }
}
