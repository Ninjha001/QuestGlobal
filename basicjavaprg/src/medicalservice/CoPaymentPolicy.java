package medicalservice;

public class CoPaymentPolicy {
	 private double coPaymentAmount;

	    public CoPaymentPolicy(double coPaymentAmount) {
	        this.coPaymentAmount = coPaymentAmount;
	    }

	    public double getCoPaymentAmount() {
	        return coPaymentAmount; 
	    }
}
