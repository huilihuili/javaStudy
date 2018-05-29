package top.leagle.thinking.chapter13;

import org.junit.Test;

public class StringStudy {

	public static String upcase(String s) {
		return s.toUpperCase();
	}

	@Test
	public void test1() {
		String q = "howdy";
		System.out.println(q);
		String qq = upcase(q);
		System.out.println(qq);
		System.out.println(q);
	}
}
