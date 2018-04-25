package top.leagle.pattern.factory.factory4.factory.sub;

import top.leagle.pattern.factory.factory4.factory.PizzaIngredientFactory;
import top.leagle.pattern.factory.factory4.indregent.Clams;
import top.leagle.pattern.factory.factory4.indregent.Dough;
import top.leagle.pattern.factory.factory4.indregent.sub.FreshClams;
import top.leagle.pattern.factory.factory4.indregent.sub.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

}
