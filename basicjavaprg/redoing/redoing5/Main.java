package redoing5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Payment p1 = new CreditCard(20000,2);
		Payment p2 = new DebitCard(10000, 4);
		Payment p3 = new DigitalWallet(5000, 3);
		System.out.println();
		System.out.print("ENTER ANY ADDITIONAL DISCOUNTS FOR CREDIT CARD PAYMENT: ");
		double additionalDiscount = scanner.nextDouble();
		if(additionalDiscount > 0) {
			p1.processPayment(2000, additionalDiscount);
		}else {
			p1.processPayment(2000);
		}
		System.out.println();
		System.out.print("ENTER ANY ADDITIONAL DISCOUNTS FOR DEBIT CARD PAYMENT: ");
		additionalDiscount = scanner.nextDouble();
		if(additionalDiscount > 0) {
			p2.processPayment(4000, additionalDiscount);
		}else {
			p2.processPayment(4000);
		}
		System.out.println();
		System.out.print("ENTER ANY ADDITIONAL DISCOUNTS FOR DIGITAL WALLET PAYMENT: ");
		additionalDiscount = scanner.nextDouble();
		if(additionalDiscount > 0) {
			p3.processPayment(6000, additionalDiscount);
		}else {
			p3.processPayment(6000);
		}
		scanner.close();
	}

}
