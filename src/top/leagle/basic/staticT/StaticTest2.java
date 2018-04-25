package top.leagle.basic.staticT;

import org.junit.Test;

class Base {
	static {
		System.out.println("base static");
	}

	public Base() {
		System.out.println("base constructor");
	}
}

public class StaticTest2 extends Base {
	static {
		System.out.println("test static");
	}

	public StaticTest2() {
		System.out.println("staticTest2 constructor");
	}

	@Test
	public void test1() {
		new StaticTest2();
	}
}
