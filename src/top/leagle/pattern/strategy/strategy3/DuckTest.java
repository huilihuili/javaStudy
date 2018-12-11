package top.leagle.pattern.strategy.strategy3;

import org.junit.Test;

import top.leagle.pattern.strategy.strategy3.behavior.impl.FlyRocketPowered;
import top.leagle.pattern.strategy.strategy3.superclass.Duck;
import top.leagle.pattern.strategy.strategy3.superclass.sub.MallardDuck;
import top.leagle.pattern.strategy.strategy3.superclass.sub.ModelDuck;

public class DuckTest {
	public static void main(String[] args) {

	}

	@Test
	public void test1() {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}

	@Test
	public void test2() {
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
