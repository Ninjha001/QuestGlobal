package medicalservice;

public class Surgery implements MedicalService {
	private double cost;

    public Surgery(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost; 
    }
}
