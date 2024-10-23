package employeemngmntsystem;

public class Contractor implements Payeable{
	public String contractorId;
	public String name;
	public double contractAmount;
	
	public Contractor(String contractorId, String name, double contractAmount) {
		this.contractorId = contractorId;
		this.name = name;
		this.contractAmount = contractAmount;
	}

	/*public String getContractorId() {
		return contractorId;
	}

	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	public double getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(double contractAmount) {
		this.contractAmount = contractAmount;
	}

	
	public double calculateSalary() {
		System.out.println("The contract amount is "+contractAmount);
		return contractAmount;
	}
	
	public void displayDetails() {
		System.out.println("Contractor name: "+name);
		System.out.println("Contractor ID: "+contractorId);
	}
}
