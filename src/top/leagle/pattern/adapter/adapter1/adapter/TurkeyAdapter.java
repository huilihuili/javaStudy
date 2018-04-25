package top.leagle.pattern.adapter.adapter1.adapter;

import top.leagle.pattern.adapter.adapter1.duck.Duck;
import top.leagle.pattern.adapter.adapter1.turkey.Turkey;

public class TurkeyAdapter implements Turkey {

	private Duck duck;

	public TurkeyAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		System.out.println("I'm turkey.");
		duck.quack();
	}

	@Override
	public void fly() {
		System.out.println("I'm turkey.");
		duck.fly();
	}

}
