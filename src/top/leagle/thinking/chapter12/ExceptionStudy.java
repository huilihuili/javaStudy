package top.leagle.thinking.chapter12;

import org.junit.Test;

public class ExceptionStudy {

	@Test
	public void test1() {
		for (int i = 1; i <= 4; i++) {
			f(i);
		}
	}

	public static void main(String[] args) {
		f();
		System.out.println("-------------------------");
		g();
		System.out.println("-------------------------");
		h();
	}

	public static void f(int i) {
		System.out.println("Initialization that requires cleanup");
		try {
			System.out.println("Point 1");
			if (i == 1) {
				return;
			}

			System.out.println("Point 2");
			if (i == 2) {
				return;
			}

			System.out.println("Point 3");
			if (i == 3) {
				return;
			}

			System.out.println("End");
			return;
		} finally {
			System.out.println("Performing cleanup");
		}
	}

	public static void f() {
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste.getMethodName());
			}
		}
	}

	public static void g() {
		f();
	}

	public static void h() {
		g();
	}
}
