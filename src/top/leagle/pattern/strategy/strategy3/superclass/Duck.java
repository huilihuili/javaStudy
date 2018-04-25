package top.leagle.pattern.strategy.strategy3.superclass;

import top.leagle.pattern.strategy.strategy3.behavior.FlyBehavior;
import top.leagle.pattern.strategy.strategy3.behavior.QuackBehavior;

/**
 * 
 * @ClassName: Duck 鸭子
 * @Description:
 * @author: Leagle
 * @date: 2018年4月10日 上午11:50:42
 */
public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public void swim() {
		System.out.println("我会游泳");
	}

	public abstract void display();

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
