package top.leagle.refactoring.chapter11.extract.superclass.origin;

public class Employee {

	public Employee(String name, int annualCost, String id) {
		this.name = name;
		this.annualCost = annualCost;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getAnnualCost() {
		return annualCost;
	}

	public String getId() {
		return id;
	}

	private String name;
	private int annualCost;
	private String id;
}
