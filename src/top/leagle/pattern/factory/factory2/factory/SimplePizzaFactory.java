package top.leagle.pattern.factory.factory2.factory;

import top.leagle.pattern.factory.factory2.pizza.Pizza;
import top.leagle.pattern.factory.factory2.pizza.sub.CheesePizza;
import top.leagle.pattern.factory.factory2.pizza.sub.GreekPizza;
import top.leagle.pattern.factory.factory2.pizza.sub.PepperoniPizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
		return pizza;

	}
}
