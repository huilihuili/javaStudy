package top.leagle.pattern.factory.factory4.pizza.sub;

import top.leagle.pattern.factory.factory4.factory.PizzaIngredientFactory;
import top.leagle.pattern.factory.factory4.pizza.Pizza;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;

	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		setDough(pizzaIngredientFactory.createDough());
	}

}
