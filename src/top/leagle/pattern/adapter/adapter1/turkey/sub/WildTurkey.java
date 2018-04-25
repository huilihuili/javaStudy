package top.leagle.pattern.adapter.adapter1.turkey.sub;

import top.leagle.pattern.adapter.adapter1.turkey.Turkey;

public class WildTurkey implements Turkey {

	@Override
	public void quack() {
		System.out.println("Gobble goggle");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}

}
