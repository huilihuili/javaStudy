package top.leagle.pattern.decorator.decorator3.superclass;

public abstract class Beverage {
	private String description = "Unknown Beverage";

	public abstract double cost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
