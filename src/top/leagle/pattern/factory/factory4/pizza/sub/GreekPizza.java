package top.leagle.pattern.factory.factory4.pizza.sub;

import top.leagle.pattern.factory.factory4.factory.PizzaIngredientFactory;
import top.leagle.pattern.factory.factory4.pizza.Pizza;

public class GreekPizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;

	public GreekPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		setClams(pizzaIngredientFactory.createClams());
	}

}
