package top.leagle.pattern.strategy.strategy3.superclass.sub;

import top.leagle.pattern.strategy.strategy3.behavior.QuackBehavior;
import top.leagle.pattern.strategy.strategy3.behavior.impl.FlyNoWay;
import top.leagle.pattern.strategy.strategy3.behavior.impl.MuteQuack;
import top.leagle.pattern.strategy.strategy3.superclass.Duck;

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

	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

}
