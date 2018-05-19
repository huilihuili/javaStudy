package top.leagle.thinking.chapter5;

import org.junit.Test;

/**
 * 
 * @ClassName: ThisStudy
 * @author: Leagle
 * @date: 2018年5月19日 下午4:02:56
 * @Description: Leaf是用来测试test1的 Person、Peeler、Apple是用来测试test2的
 *               Flower是用来测试test3的
 * 
 *               尽管可以用this调用一个构造器，但却不能调用两个。此外，必须将构造器调用置于最起始处。
 *               除了构造器之外，禁止在其他任何方法中调用构造器方法。
 */

public class ThisStudy {
	@Test
	public void test1() {
		Leaf leaf = new Leaf();
		leaf.increment().increment().increment().print();
	}

	@Test
	public void test2() {
		new Person().eat(new Apple());
	}

	@Test
	public void test3() {
		new Flower().printPetalCount();
	}

}

class Leaf {
	int i = 0;

	Leaf increment() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}
}

class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println(peeled + " Yummy");
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		System.out.println("remove peel...");
		return apple;
	}
}

class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}

class Flower {
	int petalCount = 0;
	String s = "initial value";

	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount=" + petalCount);
	}

	Flower(String ss) {
		s = ss;
		System.out.println("Constructor w/ string arg only, s=" + s);
	}

	Flower(String s, int petals) {
		this(petals);
		// ! this(s) Can't call two!
		this.s = s;
		System.out.println("String & int args");
	}

	Flower() {
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}

	void printPetalCount() {
		// ! this(11) Not inside non-constructor!
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}
}
