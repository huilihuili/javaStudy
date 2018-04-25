package top.leagle.pattern.strategy.strategy1.superclass.sub;

import top.leagle.pattern.strategy.strategy1.superclass.Duck;

/**
 * 
 * @ClassName: DecoyDuck 木头假鸭
 * @Description:
 * @author: Leagle
 * @date: 2018年4月10日 上午11:57:15
 */
public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("我是木头假鸭");
	}
	

	@Override
	public void quack() {
		System.out.println("我不会叫");
	}

	@Override
	public void fly() {
		System.out.println("我不会飞");
	}

}
