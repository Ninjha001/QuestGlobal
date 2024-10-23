package redoing5;

public class DebitCard extends Payment {
	DebitCard(double amount,int discountRate){
		super(amount,discountRate);
	}
	@Override
	public void processPayment(double amount) {
		double discount = calculateDiscount();
		double totalAmount = amount - discount;
		System.out.println("DEBIT CARD DETAILS");
		System.out.println("------------------");
		System.out.println("ORIGINAL AMOUNT: $" + amount);
		System.out.println("DISCOUNT: $" + discount);
		System.out.println("TOTAL AMOUNT: $" + totalAmount);
	}
	
	public void processPayment(double amount,double additionalDiscount) {
		double discount = calculateDiscount(additionalDiscount);
		double totalAmount = amount - discount;
		System.out.println("DEBIT CARD DETAILS");
		System.out.println("------------------");
		System.out.println("ORIGINAL AMOUNT: $" + amount);
		System.out.println("ADDITIONAL DISCOUNT: $" + additionalDiscount);
		System.out.println("DISCOUNT AFTER ADDITIONAL DISCOUNT: $" + discount);
		System.out.println("TOTAL AMOUNT: $" + totalAmount);
	}
}
