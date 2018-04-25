package top.leagle.pattern.factory.factory3.store.sub;

import top.leagle.pattern.factory.factory3.pizza.Pizza;
import top.leagle.pattern.factory.factory3.pizza.sub.NYStyleCheesePizza;
import top.leagle.pattern.factory.factory3.pizza.sub.NYStyleClamPizza;
import top.leagle.pattern.factory.factory3.pizza.sub.NYStyleGreekPizza;
import top.leagle.pattern.factory.factory3.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("greek")) {
			pizza = new NYStyleGreekPizza();
		} else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		}
		return pizza;

	}

}
