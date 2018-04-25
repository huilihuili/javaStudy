package top.leagle.pattern.factory.factory3.store;

import top.leagle.pattern.factory.factory3.pizza.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	public abstract Pizza createPizza(String type);

}
