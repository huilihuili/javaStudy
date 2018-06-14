package top.leagle.refactoring.chapter11.extract.superclass.improvement;

public abstract class Party {

	public abstract int getAnnualCost();

	protected Party(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private String name;
}
