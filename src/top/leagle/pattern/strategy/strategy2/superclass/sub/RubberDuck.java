package top.leagle.pattern.strategy.strategy2.superclass.sub;

import top.leagle.pattern.strategy.strategy2.able.Quackable;
import top.leagle.pattern.strategy.strategy2.superclass.Duck;

/**
 * 
 * @ClassName: RubberDuck 橡皮鸭
 * @Description:
 * @author: Leagle
 * @date: 2018年4月10日 上午11:54:13
 */
public class RubberDuck extends Duck implements Quackable {

	@Override
	public void display() {
		System.out.println("我是橡皮鸭");
	}

	@Override
	public void quack() {
		System.out.println("吱吱叫");
	}

}
