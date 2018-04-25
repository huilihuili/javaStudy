package top.leagle.pattern.factory.factory4;

import org.junit.Test;

import top.leagle.pattern.factory.factory4.pizza.Pizza;
import top.leagle.pattern.factory.factory4.store.PizzaStore;
import top.leagle.pattern.factory.factory4.store.sub.ChicagoPizzaStore;
import top.leagle.pattern.factory.factory4.store.sub.NYPizzaStore;

public class FactoryTest {

	@Test
	public void test1() {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println(pizza.getDough().getClass());

		pizza = chicagoStore.orderPizza("greek");
		System.out.println(pizza.getClams().getClass());

	}
}
