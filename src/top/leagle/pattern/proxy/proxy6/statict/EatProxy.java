package top.leagle.pattern.proxy.proxy6.statict;

import top.leagle.pattern.proxy.proxy6.Eat;

public class EatProxy implements Eat {
	private Eat eat;

	public EatProxy(Eat eat) {
		this.eat = eat;
	}

	@Override
	public void eat() {
		System.out.println("吃饭前洗手");
		eat.eat();
		System.out.println("吃完后刷碗");
	}
}
