package top.leagle.pattern.proxy.proxy6.statict;

import top.leagle.pattern.proxy.proxy6.Eat;
import top.leagle.pattern.proxy.proxy6.EatImpl;

public class ProxyTest {
	public static void main(String[] args) {
		Eat eat = new EatImpl();
		eat.eat();

		System.out.println();

		EatProxy eatProxy = new EatProxy(eat);
		eatProxy.eat();
	}
}
