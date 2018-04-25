package top.leagle.pattern.adapter.adapter1.duck.sub;

import top.leagle.pattern.adapter.adapter1.duck.Duck;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("quack");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
