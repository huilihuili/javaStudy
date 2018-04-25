package top.leagle.pattern.decorator.decorator1;

import org.junit.Test;

import top.leagle.pattern.decorator.decorator1.superclass.Beverage;
import top.leagle.pattern.decorator.decorator1.superclass.sub.HouseBlendWithMocha;
import top.leagle.pattern.decorator.decorator1.superclass.sub.HouseBlendWithMochaAndSoy;
import top.leagle.pattern.decorator.decorator1.superclass.sub.HouseBlendWithSoy;

public class DecoratorTest {

	@Test
	public void test1() {
		Beverage beverage = new HouseBlendWithMocha();
		System.out.println(beverage.cost());

		beverage = new HouseBlendWithSoy();
		System.out.println(beverage.cost());

		beverage = new HouseBlendWithMochaAndSoy();
		System.out.println(beverage.cost());

	}
}
