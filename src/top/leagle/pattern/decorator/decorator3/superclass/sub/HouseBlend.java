package top.leagle.pattern.decorator.decorator3.superclass.sub;

import top.leagle.pattern.decorator.decorator3.superclass.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		setDescription("HouseBlend");
	}

	@Override
	public double cost() {
		return 10;
	}

}
