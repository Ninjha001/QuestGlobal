package payment;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Payment credit = new CreditCardPayment(300,2.5);
		Payment debit = new DebitCardPayment(100,1.5);
		Payment digital = new DigitalWalletPayment(200,3.5);
		System.out.println();
		System.out.print("Enter the additional discount amount if any for credit card payment: ");
		double additionalDiscount = scan.nextDouble();
		if(additionalDiscount>0) {
			credit.processPayment(2000,additionalDiscount);
		}else {
			credit.processPayment(2000);
		}
		System.out.println();
		System.out.print("Enter the additional discount amount if any for debit card payment: ");
		additionalDiscount = scan.nextDouble();
		if(additionalDiscount>0) {
			debit.processPayment(100,additionalDiscount);
		}else {
			debit.processPayment(100);
		}
		System.out.println();
		System.out.print("Enter the additional discount amount if any for digital wallet payment: ");
		additionalDiscount = scan.nextDouble();
		if(additionalDiscount>0) {
			digital.processPayment(1000,additionalDiscount);
		}else {
			digital.processPayment(1000);
		}
		System.out.println();
		
		scan.close();
	}

}
