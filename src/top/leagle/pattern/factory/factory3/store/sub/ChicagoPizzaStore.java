package top.leagle.pattern.factory.factory3.store.sub;

import top.leagle.pattern.factory.factory3.pizza.Pizza;
import top.leagle.pattern.factory.factory3.pizza.sub.ChicagoStyleCheesePizza;
import top.leagle.pattern.factory.factory3.pizza.sub.ChicagoStyleClamPizza;
import top.leagle.pattern.factory.factory3.pizza.sub.ChicagoStyleGreekPizza;
import top.leagle.pattern.factory.factory3.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("greek")) {
			pizza = new ChicagoStyleGreekPizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		}
		return pizza;
	}

}
