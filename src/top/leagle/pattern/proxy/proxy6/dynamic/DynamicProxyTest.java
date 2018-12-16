package top.leagle.pattern.proxy.proxy6.dynamic;

import java.lang.reflect.Proxy;

import top.leagle.pattern.proxy.proxy6.Eat;
import top.leagle.pattern.proxy.proxy6.EatImpl;

public class DynamicProxyTest {
	public static void main(String[] args) {
		Eat eat = new EatImpl();
		eat.eat();

		System.out.println();

		Eat eatProxy = (Eat) Proxy.newProxyInstance(Eat.class.getClassLoader(), new Class[] { Eat.class },
				new DynamicProxyHandler(eat));
		eatProxy.eat();
	}
}
