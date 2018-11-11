package top.leagle.basic.finalT;

import org.junit.Test;

public class FinalTest {
	public static double j = Math.random();
	public final double i = Math.random();

	public static final void a() {

	}

	public static final void a(int a) {

	}

	public final void a(int a, int b) {

	}

	public void a(int a, float b) {

	}

	@Test
	public void test1() {
		String a = "hello2";
		final String b = "hello";
		String d = "hello";
		String c = b + 2;
		String e = d + 2;
		System.out.println((a == c));
		System.out.println((a == e));
	}

	@Test
	public void test2() {
		final MyClass myClass = new MyClass();
		System.out.println(++myClass.i);
	}

	@Test
	public void test3() {
		FinalTest myClass1 = new FinalTest();
		FinalTest myClass2 = new FinalTest();
		System.out.println(myClass1.i);
		System.out.println(myClass1.j);
		System.out.println(myClass2.i);
		System.out.println(myClass2.j);
	}

	class MyClass {
		public int i = 0;
	}

}
