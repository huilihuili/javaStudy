package top.leagle.pattern.factory.factory1.store;

import top.leagle.pattern.factory.factory1.pizza.Pizza;
import top.leagle.pattern.factory.factory1.pizza.sub.CheesePizza;
import top.leagle.pattern.factory.factory1.pizza.sub.GreekPizza;
import top.leagle.pattern.factory.factory1.pizza.sub.PepperoniPizza;

public class PizzaStore {
	Pizza pizza;

	public Pizza orderPizza(String type) {
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
