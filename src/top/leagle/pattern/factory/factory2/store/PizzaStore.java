package top.leagle.pattern.factory.factory2.store;

import top.leagle.pattern.factory.factory2.factory.SimplePizzaFactory;
import top.leagle.pattern.factory.factory2.pizza.Pizza;

public class PizzaStore {
	SimplePizzaFactory simplePizzaFactory;

	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = simplePizzaFactory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
