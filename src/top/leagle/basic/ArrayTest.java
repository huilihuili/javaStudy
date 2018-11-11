package top.leagle.basic;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;

public class ArrayTest {
	public int a = 0;

	public static void main(String[] args) {
		int[] a = { 0 };
		int b = 0;
		ArrayTest arrayTest = new ArrayTest();

		arrayFun(a);
		intFun(b);
		objectFun(arrayTest);

		System.out.println(a[0]);
		System.out.println(b);
		System.out.println(arrayTest.a);

		a[0] = 0;
		System.out.println("------");
		updateArrayFun(a, 0);
		System.out.println("------");
		System.out.println(a[0]);

		ArrayTest arrayTest1 = null;
		ArrayTest arrayTest2 = new ArrayTest();
		arrayTest2.a = 9;

		System.out.println("------");
		updateObjectFun(arrayTest1, 0, arrayTest2);
		System.out.println("------");
		System.out.println(arrayTest1);

		arrayTest1 = new ArrayTest();
		arrayTest1.a = 8;
		System.out.println("------");
		updateObjectFun(arrayTest1, 0, arrayTest2);
		System.out.println("------");
		System.out.println(arrayTest1.a);

	}

	public static void arrayFun(int[] a) {
		a[0] = 1;
	}

	public static void updateArrayFun(int[] a, int i) {
		if (i > 2) {
			return;
		}
		System.out.println(i + " -- " + a[0]);
		if (i == 0) {
			updateArrayFun(a, i + 1);
		}
		if (i == 1) {
			a[0] = 1;
		}
		System.out.println(i + " -- " + a[0]);
	}

	public static void intFun(int a) {
		a = 1;
	}

	public static void objectFun(ArrayTest arrayTest) {
		arrayTest.a = 1;
	}

	public static void updateObjectFun(ArrayTest arrayTest, int i, ArrayTest arrayTest2) {
		if (i > 2) {
			return;
		}
		System.out.println(i + " -- " + (arrayTest == null ? "null" : "" + arrayTest.a));
		if (i == 0) {
			updateObjectFun(arrayTest, i + 1, arrayTest2);
		}
		if (i == 1) {
			arrayTest = arrayTest2;
		}
		System.out.println(i + " -- " + (arrayTest == null ? "null" : "" + arrayTest.a));
	}

	public static void refTest(int[] a, int[] b) {
		a = b;
	}

	@Test
	public void test() {
		int[] a = { 0 };
		int[] b = { 1 };
		int[] c = a;
		System.out.println(c[0]);
		refTest(c, b);
		System.out.println(c[0]);
		c = b;
		System.out.println(c[0]);
	}

	@Test
	public void test1() {
		float f = 42.0f;
		float f1[] = new float[2];
		float f2[] = new float[2];
		float[] f3 = f1;
		long x = 42;
		f1[0] = 42.0f;
	}

}
