package top.leagle.pattern.factory.factory1;

import org.junit.Test;

import top.leagle.pattern.factory.factory1.pizza.Pizza;
import top.leagle.pattern.factory.factory1.store.PizzaStore;

public class FactoryTest {

	@Test
	public void test1() {
		PizzaStore pizzaStore = new PizzaStore();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza.getClass());
	}
}
