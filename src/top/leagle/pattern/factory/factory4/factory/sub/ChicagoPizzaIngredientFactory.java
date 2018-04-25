package top.leagle.pattern.factory.factory4.factory.sub;

import top.leagle.pattern.factory.factory4.factory.PizzaIngredientFactory;
import top.leagle.pattern.factory.factory4.indregent.Clams;
import top.leagle.pattern.factory.factory4.indregent.Dough;
import top.leagle.pattern.factory.factory4.indregent.sub.FrozenClams;
import top.leagle.pattern.factory.factory4.indregent.sub.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

}
