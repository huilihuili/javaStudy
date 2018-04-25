package top.leagle.pattern.strategy.strategy1.superclass.sub;

import top.leagle.pattern.strategy.strategy1.superclass.Duck;

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

	@Override
	public void fly() {
		System.out.println("我不会飞");
	}

	@Override
	public void quack() {
		System.out.println("吱吱叫");
	}

}
