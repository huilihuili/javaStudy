package top.leagle.pattern.factory.factory2;

import org.junit.Test;

import top.leagle.pattern.factory.factory2.factory.SimplePizzaFactory;
import top.leagle.pattern.factory.factory2.pizza.Pizza;
import top.leagle.pattern.factory.factory2.store.PizzaStore;

public class FactoryTest {

	@Test
	public void test1() {
		SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza.getClass());
	}
}
