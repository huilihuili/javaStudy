package top.leagle.pattern.strategy.strategy1.superclass.sub;

import top.leagle.pattern.strategy.strategy1.superclass.Duck;

/**
 * 
 * @ClassName: MallardDuck 绿头鸭
 * @Description:
 * @author: Leagle
 * @date: 2018年4月10日 上午11:50:39
 */
public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("我是绿头的");
	}

}
