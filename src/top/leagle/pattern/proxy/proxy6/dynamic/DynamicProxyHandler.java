package top.leagle.pattern.proxy.proxy6.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import top.leagle.pattern.proxy.proxy6.Eat;

public class DynamicProxyHandler implements InvocationHandler {
	private Eat eat;

	public DynamicProxyHandler(Eat eat) {
		this.eat = eat;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		if (method.getName().equals("eat")) {
			System.out.println("吃饭前洗手");
			result = method.invoke(eat, args);
			System.out.println("吃完后刷碗");
		}
		return result;
	}
}
