package top.leagle.pattern.proxy.proxy5;

import java.lang.reflect.Proxy;

import org.junit.Test;

import top.leagle.pattern.proxy.proxy5.person.PersonBean;
import top.leagle.pattern.proxy.proxy5.person.impl.PersonBeanImpl;
import top.leagle.pattern.proxy.proxy5.proxy.NonOwnerInvocationHander;
import top.leagle.pattern.proxy.proxy5.proxy.OwnerInvocationHander;

public class ProxyTest {

	@Test
	public void test1() {
		PersonBean personBean1 = new PersonBeanImpl("Leagle");

		PersonBean ownerProxy = getOwnerProxy(personBean1);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("Bowling, Go");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(personBean1);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("Bowling, Go");
		} catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

		System.out.println();
		System.out.println(personBean1.getInterests());
		System.out.println(personBean1.getHotOrNotRating());
	}

	public PersonBean getOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(), new OwnerInvocationHander(personBean));
	}

	public PersonBean getNonOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(), new NonOwnerInvocationHander(personBean));
	}
}
