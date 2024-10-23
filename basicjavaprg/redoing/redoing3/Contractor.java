package redoing3;

public class Contractor implements Payable {
	private String contractId;
	private String name;
	private double contractAmount;
	
	Contractor(String contractId, String name, double contractAmount){
		this.contractAmount=contractAmount;
		this.contractId=contractId;
		this.name=name;
	}
	@Override
	public double calculateSalary() {
		System.out.println("CONTRACTOR SALARY: $ " + contractAmount);
		return contractAmount;
	}

	@Override
	public void displayDetails() {
		System.out.println("CONTRACTOR ID: " + contractId);
		System.out.println("CONTRACTOR NAME: " + name);
	}

}
