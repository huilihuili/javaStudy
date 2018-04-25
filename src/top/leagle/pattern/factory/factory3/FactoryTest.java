package top.leagle.pattern.factory.factory3;

import org.junit.Test;

import top.leagle.pattern.factory.factory3.pizza.Pizza;
import top.leagle.pattern.factory.factory3.store.PizzaStore;
import top.leagle.pattern.factory.factory3.store.sub.ChicagoPizzaStore;
import top.leagle.pattern.factory.factory3.store.sub.NYPizzaStore;

public class FactoryTest {

	@Test
	public void test1() {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println(pizza.getClass());

		pizza = chicagoStore.orderPizza("clam");
		System.out.println(pizza.getClass());

	}
}
