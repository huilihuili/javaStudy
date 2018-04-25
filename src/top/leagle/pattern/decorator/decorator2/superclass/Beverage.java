package top.leagle.pattern.decorator.decorator2.superclass;

public class Beverage {

	private String description;

	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;

	private double mochaCost = 0.1;
	private double soyCost = 0.2;
	private double milkCost = 0.3;
	private double whipCost = 0.4;

	public double cost() {
		double condimentCost = 0.0;
		if (isMocha()) {
			condimentCost += mochaCost;
		}
		if (isSoy()) {
			condimentCost += soyCost;
		}
		if (isMilk()) {
			condimentCost += milkCost;
		}
		if (isWhip()) {
			condimentCost += whipCost;
		}
		return condimentCost;
	};

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean isSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public boolean isMocha() {
		return mocha;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public boolean isWhip() {
		return whip;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
