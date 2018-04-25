package top.leagle.pattern.strategy.strategy1.superclass;

/**
 * 
 * @ClassName: Duck 鸭子
 * @Description:
 * @author: Leagle
 * @date: 2018年4月10日 上午11:50:42
 */
public abstract class Duck {
	public void quack() {
		System.out.println("呱呱叫");
	}

	public void swim() {
		System.out.println("我会游泳");
	}

	public void fly() {
		System.out.println("用翅膀在飞");
	}

	public abstract void display();
}
