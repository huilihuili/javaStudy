package top.leagle.refactoring.chapter11.extract.superclass.improvement;

public class Employee extends Party{

	public Employee(String name, int annualCost, String id) {
		super(name);
		this.annualCost = annualCost;
		this.id = id;
	}
	
	@Override
	public int getAnnualCost() {
		return annualCost;
	}

	public String getId() {
		return id;
	}

	private int annualCost;
	private String id;
}
