package top.leagle.pattern.strategy.strategy3.superclass.sub;

import top.leagle.pattern.strategy.strategy3.behavior.FlyBehavior;
import top.leagle.pattern.strategy.strategy3.behavior.QuackBehavior;
import top.leagle.pattern.strategy.strategy3.behavior.impl.FlyNoWay;
import top.leagle.pattern.strategy.strategy3.behavior.impl.Quack;
import top.leagle.pattern.strategy.strategy3.superclass.Duck;

public class ModelDuck extends Duck {

	@Override
	public void display() {
		System.out.println("我是模型鸭");
	}

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	

}
