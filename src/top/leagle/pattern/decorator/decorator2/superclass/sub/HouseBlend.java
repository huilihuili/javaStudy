package top.leagle.pattern.decorator.decorator2.superclass.sub;

import top.leagle.pattern.decorator.decorator2.superclass.Beverage;

public class HouseBlend extends Beverage {

	@Override
	public double cost() {
		return 10 + super.cost();
	}
}
