package medicalservice;

public class DoctorVisit implements MedicalService {
	private double cost;
	public DoctorVisit(double cost) {
        this.cost = cost;
    }
	@Override
	public double getCost() {
		return cost;
	}

}
