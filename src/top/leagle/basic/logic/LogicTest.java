package top.leagle.basic.logic;

import org.junit.Test;

public class LogicTest {

	public static boolean truePrint() {
		System.out.println("true");
		return true;
	}

	public static boolean falsePrint() {
		System.out.println("false");
		return false;
	}

	@Test
	public void test1() {
		System.out.println(true && truePrint() || falsePrint());
		System.out.println(false && truePrint() || falsePrint());
	}
}
