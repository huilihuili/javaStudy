package top.leagle.basic;

import org.junit.Test;

public class RandomTest {
	@Test
	public void test1() {
		double random = Math.random();
		System.out.println(random);
		System.out.println((1L << 48) - 1);
		System.out.println((1L << 48));
	}
}
