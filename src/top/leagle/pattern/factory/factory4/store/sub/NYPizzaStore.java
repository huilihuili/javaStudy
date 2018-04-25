package top.leagle.pattern.factory.factory4.store.sub;

import top.leagle.pattern.factory.factory4.factory.PizzaIngredientFactory;
import top.leagle.pattern.factory.factory4.factory.sub.NYPizzaIngredientFactory;
import top.leagle.pattern.factory.factory4.pizza.Pizza;
import top.leagle.pattern.factory.factory4.pizza.sub.CheesePizza;
import top.leagle.pattern.factory.factory4.pizza.sub.GreekPizza;
import top.leagle.pattern.factory.factory4.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

		if (type.equals("cheese")) {
			pizza = new CheesePizza(pizzaIngredientFactory);
		} else if (type.equals("greek")) {
			pizza = new GreekPizza(pizzaIngredientFactory);
		}
		return pizza;

	}

}
