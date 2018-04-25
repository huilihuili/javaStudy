package top.leagle.pattern.strategy.strategy3.behavior.impl;

import top.leagle.pattern.strategy.strategy3.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("我不会飞");
	}

}
