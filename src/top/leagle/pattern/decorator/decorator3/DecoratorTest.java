package top.leagle.pattern.decorator.decorator3;

import org.junit.Test;

import top.leagle.pattern.decorator.decorator3.superclass.Beverage;
import top.leagle.pattern.decorator.decorator3.superclass.sub.HouseBlend;
import top.leagle.pattern.decorator.decorator3.superclass.sub.superclass.sub.Mocha;
import top.leagle.pattern.decorator.decorator3.superclass.sub.superclass.sub.Soy;

public class DecoratorTest {

	@Test
	public void test1() {
		Beverage beverage = new HouseBlend();
		beverage = new Mocha(beverage);
		System.out.println(beverage.cost());

		Beverage beverage1 = new HouseBlend();
		beverage1 = new Soy(beverage1);
		System.out.println(beverage1.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		System.out.println(beverage3.cost());

	}
}
