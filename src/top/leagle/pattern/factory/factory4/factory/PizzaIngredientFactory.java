package top.leagle.pattern.factory.factory4.factory;

import top.leagle.pattern.factory.factory4.indregent.Clams;
import top.leagle.pattern.factory.factory4.indregent.Dough;

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Clams createClams();
}
