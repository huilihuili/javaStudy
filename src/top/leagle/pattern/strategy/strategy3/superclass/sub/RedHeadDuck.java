package top.leagle.pattern.strategy.strategy3.superclass.sub;

import top.leagle.pattern.strategy.strategy3.behavior.FlyBehavior;
import top.leagle.pattern.strategy.strategy3.behavior.QuackBehavior;
import top.leagle.pattern.strategy.strategy3.behavior.impl.FlyWithWings;
import top.leagle.pattern.strategy.strategy3.behavior.impl.Quack;
import top.leagle.pattern.strategy.strategy3.superclass.Duck;

/**
 * 
 * @ClassName: RedHeadDuck 红头鸭
 * @Description:
 * @author: Leagle
 * @date: 2018年4月10日 上午11:52:54
 */
public class RedHeadDuck extends Duck {

	@Override
	public void display() {
		System.out.println("我是红头的");
	}

	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

}
