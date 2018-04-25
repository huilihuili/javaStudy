package top.leagle.pattern.decorator.decorator2;

import org.junit.Test;

import top.leagle.pattern.decorator.decorator2.superclass.Beverage;
import top.leagle.pattern.decorator.decorator2.superclass.sub.HouseBlend;

public class DecoratorTest {

	@Test
	public void test1() {

		Beverage beverage = new HouseBlend();
		beverage.setMocha(true);
		System.out.println(beverage.cost());

		beverage.setMocha(false);
		beverage.setSoy(true);
		System.out.println(beverage.cost());
		
		beverage.setMocha(true);
		beverage.setSoy(true);
		System.out.println(beverage.cost());
		

	}
}
