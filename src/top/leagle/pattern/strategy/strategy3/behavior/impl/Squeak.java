package top.leagle.pattern.strategy.strategy3.behavior.impl;

import top.leagle.pattern.strategy.strategy3.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("吱吱叫");
	}

}
