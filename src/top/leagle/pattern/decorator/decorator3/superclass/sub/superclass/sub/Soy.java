package top.leagle.pattern.decorator.decorator3.superclass.sub.superclass.sub;

import top.leagle.pattern.decorator.decorator3.superclass.Beverage;
import top.leagle.pattern.decorator.decorator3.superclass.sub.superclass.CondimentDecorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDestription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.2 + beverage.cost();
	}

}
