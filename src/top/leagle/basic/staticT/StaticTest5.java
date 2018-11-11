package top.leagle.basic.staticT;

import org.junit.Test;

public class StaticTest5 {

	static {
		i = 5;
	}

	public static int i = 4;

	private static void testMethod() {
		System.out.println("testMethod");
	}

	private void testMethod1() {
		System.out.println("testMethod");
	}

	public static void main(String[] args) {
		System.out.println(StaticTest5.i);
	}

	@Test
	public void test1() {
		StaticTest5 staticTest5 = null;
		staticTest5.testMethod();
		((StaticTest5) null).testMethod();
		((StaticTest5) null).testMethod1();
	}
}
