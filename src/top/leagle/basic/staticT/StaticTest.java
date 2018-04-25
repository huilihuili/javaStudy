package top.leagle.basic.staticT;

import org.junit.Test;

public class StaticTest {
	static int value = 33;

	private void printValue() {
		int value = 3;
		System.out.println(this.value);
	}

	@Test
	public void test() {
		new StaticTest().printValue();
	}

}
