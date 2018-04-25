package top.leagle.basic;

import org.junit.Test;

public class VariableTest {

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

//	public void VariableFunction(int i, int j, int k, int... args) {
//		System.out.println("i, j, k, args ---");
//	}

	public void VariableFunction(int i, int j, int k, int m, int... args) {
		System.out.println("i, j, k, m, args ---");
	}

}
