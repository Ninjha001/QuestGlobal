package payment;

public abstract class Payment implements PaymentProcessor {
	protected double amount;
	protected double discountRate;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public Payment(double amount, double discountRate) {
		this.amount = amount;
		this.discountRate = discountRate;
	}
	
	public abstract void processPayment(double amount);
	public abstract void processPayment(double amount,double additionalDiscount);
	
	public double calculateDiscount() {
		return (amount*discountRate)/100;
	}
	public double calculateDiscount(double additionalDiscount) {
		double totalDiscount = calculateDiscount()+additionalDiscount;
		return totalDiscount;
	}
}
