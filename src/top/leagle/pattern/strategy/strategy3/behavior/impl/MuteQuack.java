package top.leagle.pattern.strategy.strategy3.behavior.impl;

import top.leagle.pattern.strategy.strategy3.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("我不会叫");
	}

}
