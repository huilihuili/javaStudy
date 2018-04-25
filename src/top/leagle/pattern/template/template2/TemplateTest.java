package top.leagle.pattern.template.template2;

import org.junit.Test;

import top.leagle.pattern.template.template2.caffeine.CaffeineBeverage;
import top.leagle.pattern.template.template2.caffeine.sub.CoffeeWithHook;

public class TemplateTest {

	@Test
	public void test1() {
		CaffeineBeverage caffeineBeverage = new CoffeeWithHook();
		caffeineBeverage.prepareRecipe();
	}
}
