package top.leagle.pattern.decorator.decorator3.superclass.sub.superclass.sub;

import top.leagle.pattern.decorator.decorator3.superclass.Beverage;
import top.leagle.pattern.decorator.decorator3.superclass.sub.superclass.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDestription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.1 + beverage.cost();
	}

}
