package top.leagle.pattern.strategy.strategy3.superclass.sub;

import top.leagle.pattern.strategy.strategy3.behavior.QuackBehavior;
import top.leagle.pattern.strategy.strategy3.behavior.impl.FlyNoWay;
import top.leagle.pattern.strategy.strategy3.behavior.impl.Squeak;
import top.leagle.pattern.strategy.strategy3.superclass.Duck;

/**
 * 
 * @ClassName: RubberDuck 橡皮鸭
 * @Description:
 * @author: Leagle
 * @date: 2018年4月10日 上午11:54:13
 */
public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("我是橡皮鸭");
	}

	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}

}
