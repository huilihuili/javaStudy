package top.leagle.pattern.decorator.decorator1.superclass;

public abstract class Beverage {

	private String description;

	public abstract double cost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
