package medicalservice;
import java.util.List;
public class BillingCalculator {
	 
    public double calculateBill(List<MedicalService> services) {
        double total = 0;
        for (MedicalService service : services) {
            total += service.getCost();
        }
        return total;
    }

    
    public double calculateBill(List<MedicalService> services, InsurancePlan insurancePlan) {
        double total = calculateBill(services);
        double coverage = total * (insurancePlan.getCoveragePercentage() / 100);
        return total - coverage; 
    }

    
    public double calculateBill(List<MedicalService> services, InsurancePlan insurancePlan, CoPaymentPolicy coPaymentPolicy) {
        double totalAfterInsurance = calculateBill(services, insurancePlan);
        return totalAfterInsurance + coPaymentPolicy.getCoPaymentAmount(); 
    }
}
