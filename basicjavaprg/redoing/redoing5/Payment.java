package redoing5;

public abstract class Payment implements PaymentProcessor {
	protected double amount;
	protected int discountRate;
	
	public Payment(double amount,int discountRate) {
		this.amount=amount;
		this.discountRate=discountRate;
	}
	
	public abstract void processPayment(double amount);
	public abstract void processPayment(double amount, double additionalDiscount);
	
	double calculateDiscount() {
		return amount * discountRate/100;
	}
	double calculateDiscount(double additionalDiscount) {
		double discount = calculateDiscount();
		return discount + additionalDiscount;
	}
}
