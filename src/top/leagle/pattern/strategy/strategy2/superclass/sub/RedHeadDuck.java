package top.leagle.pattern.strategy.strategy2.superclass.sub;

import top.leagle.pattern.strategy.strategy2.able.Flyable;
import top.leagle.pattern.strategy.strategy2.able.Quackable;
import top.leagle.pattern.strategy.strategy2.superclass.Duck;

/**
 * 
 * @ClassName: RedHeadDuck 红头鸭
 * @Description:
 * @author: Leagle
 * @date: 2018年4月10日 上午11:52:54
 */
public class RedHeadDuck extends Duck implements Flyable, Quackable {

	@Override
	public void display() {
		System.out.println("我是红头的");
	}

	@Override
	public void quack() {
		System.out.println("呱呱叫");
	}

	@Override
	public void fly() {
		System.out.println("用翅膀在飞");
	}

}
