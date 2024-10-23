package medicalservice;

public class LabTest implements MedicalService {
	private double cost;

    public LabTest(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
