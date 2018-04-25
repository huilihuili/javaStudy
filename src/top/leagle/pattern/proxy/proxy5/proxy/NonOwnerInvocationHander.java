package top.leagle.pattern.proxy.proxy5.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import top.leagle.pattern.proxy.proxy5.person.PersonBean;

public class NonOwnerInvocationHander implements InvocationHandler {
	PersonBean personBean;

	public NonOwnerInvocationHander(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(personBean, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(personBean, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

}
