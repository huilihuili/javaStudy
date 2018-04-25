package top.leagle.pattern.template.template1;

import org.junit.Test;

import top.leagle.pattern.template.template1.caffeine.CaffeineBeverage;
import top.leagle.pattern.template.template1.caffeine.sub.Coffee;
import top.leagle.pattern.template.template1.caffeine.sub.Tea;

public class TemplateTest {

	@Test
	public void test1() {
		CaffeineBeverage caffeineBeverage = new Tea();
		caffeineBeverage.prepareRecipe();

		caffeineBeverage = new Coffee();
		caffeineBeverage.prepareRecipe();
	}
}
