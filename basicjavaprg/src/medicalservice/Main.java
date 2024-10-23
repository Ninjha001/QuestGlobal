package medicalservice;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        BillingCalculator calculator = new BillingCalculator();
        List<MedicalService> services = new ArrayList<>();

        System.out.print("Enter number of services rendered: ");
        int numServices = scanner.nextInt();

        for (int i = 0; i < numServices; i++) {
            System.out.print("Enter type of service (1 for DoctorVisit, 2 for LabTest, 3 for Surgery): ");
            int serviceType = scanner.nextInt();
            System.out.print("Enter cost of service: ");
            double cost = scanner.nextDouble();

            switch (serviceType) {
                case 1:
                    services.add(new DoctorVisit(cost));
                    break;
                case 2:
                    services.add(new LabTest(cost));
                    break;
                case 3:
                    services.add(new Surgery(cost));
                    break;
                default:
                    System.out.println("Invalid service type. Please try again.");
                    i--; 
            }
        }

        System.out.print("Enter insurance coverage percentage: ");
        double coveragePercentage = scanner.nextDouble();
        InsurancePlan insurancePlan = new InsurancePlan(coveragePercentage);

        System.out.print("Enter co-payment amount: ");
        double coPaymentAmount = scanner.nextDouble();
        CoPaymentPolicy coPaymentPolicy = new CoPaymentPolicy(coPaymentAmount);

        double totalBill = calculator.calculateBill(services, insurancePlan, coPaymentPolicy);

        System.out.println("\n--- Billing Summary ---");
        for (MedicalService service : services) {
            System.out.println("Service Cost: $" + service.getCost());
        }
        System.out.println("Insurance Coverage: " + coveragePercentage + "%");
        System.out.println("Co-Payment Amount: $" + coPaymentAmount);
        System.out.printf("Final Patient Bill: $%.2f\n", totalBill);
        
        scanner.close();
	}

}
