package medicalservice;

public class InsurancePlan {
	private double coveragePercentage;

    public InsurancePlan(double coveragePercentage) {
        this.coveragePercentage = coveragePercentage;
    }

    public double getCoveragePercentage() {
        return coveragePercentage; 
    }
}
