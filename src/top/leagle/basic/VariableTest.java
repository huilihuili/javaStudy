package top.leagle.basic;

import org.junit.Test;

public class VariableTest {

	public static void main(String[] args) {
		int a = 2;
		int b = a;
		b--;
		System.out.println(a);
		System.out.println(b);

		// String aString = null;
		// String bString = aString;
		// aString = "5";
		//
		// System.out.println(aString);
		// System.out.println(bString);

		// String aString = "4";
		// String bString = aString;
		// aString = "5";
		//
		// System.out.println(aString);
		// System.out.println(bString);

		// VariableTest aTest = null;
		// VariableTest bTest = aTest;
		// aTest = new VariableTest();
		// System.out.println(aTest == null);
		// System.out.println(bTest == null);

		// VariableTest aTest = new VariableTest();
		// VariableTest bTest = aTest;
		// aTest = null;
		// System.out.println(aTest == null);
		// System.out.println(bTest == null);

		// VariableTest aTest = null;
		// VariableTest bTest = null;
		// System.out.println(aTest == bTest);

		// VariableTest aTest = new VariableTest();
		// VariableTest bTest = aTest;
		// System.out.println(aTest == bTest);
		// aTest = new VariableTest();
		// System.out.println(aTest == bTest);
	}

	@Test
	public void test1() {
		VariableFunction(1, 2, 3);
		VariableFunction(new int[] { 1, 2, 3 });
	}

	@Test
	public void test2() {
		VariableFunction(new int[] { 1, 2, 3, 4 });

		VariableFunction(1, 2, 3, 4, 5);
	}

	public void RegularFunction() {
		System.out.println("");
	}

	public void RegularFunction(int i) {
		System.out.println("i");
	}

	public void RegularFunction(int i, int j) {
		System.out.println("i, j");
	}

	public void RegularFunction(int i, int j, int k) {
		System.out.println("i, j, k");
	}

	public void VariableFunction(int i, int j, int k) {
		System.out.println("i, j, k");
	}

	public void VariableFunction(int... args) {
		System.out.println("args ---");
	}

	public void VariableFunction(int i, int... args) {
		System.out.println("i, args ---");
	}

	public void VariableFunction(int i, int j, int... args) {
		System.out.println("i, j, args ---");
	}

	// public void VariableFunction(int i, int j, int k, int... args) {
	// System.out.println("i, j, k, args ---");
	// }

	public void VariableFunction(int i, int j, int k, int m, int... args) {
		System.out.println("i, j, k, m, args ---");
	}

}
