package top.leagle.pattern.strategy.strategy3.behavior.impl;

import top.leagle.pattern.strategy.strategy3.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("用翅膀在飞");
	}

}
