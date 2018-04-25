package top.leagle.pattern.strategy.strategy3.behavior.impl;

import top.leagle.pattern.strategy.strategy3.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("借助火箭飞行");
	}
}
