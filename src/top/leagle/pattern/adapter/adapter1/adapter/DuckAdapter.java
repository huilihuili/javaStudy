package top.leagle.pattern.adapter.adapter1.adapter;

import top.leagle.pattern.adapter.adapter1.duck.Duck;
import top.leagle.pattern.adapter.adapter1.turkey.Turkey;

public class DuckAdapter implements Duck {

	private Turkey turkey;

	public DuckAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		System.out.println("I'm duck.");
		turkey.quack();

	}

	@Override
	public void fly() {
		System.out.println("I'm duck.");
		turkey.fly();
	}

}
