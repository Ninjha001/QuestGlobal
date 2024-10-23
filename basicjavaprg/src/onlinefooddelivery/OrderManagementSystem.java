package onlinefooddelivery;

import java.util.Scanner;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillCalculator billCalculator = new BillCalculator();

        System.out.print("Enter the order amount: ");
        double orderAmount = scanner.nextDouble();

        System.out.print("Enter customer type (Regular, Premium, Corporate): ");
        String customerType = scanner.next();

        Customer customer;

        switch (customerType.toLowerCase()) {
            case "regular":
                customer = new RegularCustomer();
                break;
            case "premium":
                customer = new PremiumCustomer();
                break;
            case "corporate":
                customer = new CorporateCustomer();
                break;
            default:
                System.out.println("Invalid customer type. Defaulting to Regular.");
                customer = new RegularCustomer();
                break;
        }

        double finalBill;

        finalBill = billCalculator.calculateBill(orderAmount, 0, customer); 

        System.out.printf("Original Order Amount: %.2f\n", orderAmount);
        System.out.printf("Discount Applied (%.0f%%): %.2f\n", customer.getDiscountRate() * 100, orderAmount * customer.getDiscountRate());
        System.out.printf("Final Bill Amount: %.2f\n", finalBill);

        scanner.close();
    }
}
