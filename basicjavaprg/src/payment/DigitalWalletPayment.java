package payment;

public class DigitalWalletPayment extends Payment {
	public DigitalWalletPayment(double amount,double discountRate) {
		super(amount,discountRate);
	}
	
	public void processPayment(double amount) {
        double discount = calculateDiscount();
        double totalAmount = amount - discount;
        System.out.println("Credit Card Payment:");
        System.out.printf("Original Amount: $%.2f\n", amount);
        System.out.printf("Discount: $%.2f\n", discount);
        System.out.printf("Total Amount after Discount: $%.2f\n", totalAmount);
     }
	
	public void processPayment(double amount,double additionalDiscount) {
    	double discount = calculateDiscount(additionalDiscount);
        double totalAmount = amount - discount;
        System.out.println("Credit Card Payment:");
        System.out.printf("Original Amount: $%.2f\n", amount);
        System.out.printf("Discount: $%.2f\n", discount);
        System.out.printf("Additional Discount: $%.2f\n",additionalDiscount);
        System.out.printf("Total Amount after Discount: $%.2f\n", totalAmount);
	}
}
