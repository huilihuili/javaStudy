package top.leagle.utilTest;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void hashTest() {
		int h = 0;
		System.out.println((h = 8) - (h - 3));
		System.out.println((h = 8) ^ (h - 3));
		System.out.println(8 ^ 5);
		System.out.println(Integer.toBinaryString(8));
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(13));
	}
}
