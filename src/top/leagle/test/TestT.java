package top.leagle.test;

import org.junit.Test;

class A {
	private String s;

	public A(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

}

public class TestT {

	@Test
	public void test() {
		System.out.println("hello".getBytes());
		System.out.println(new A("hello").getS() == "hello");
	}

}
