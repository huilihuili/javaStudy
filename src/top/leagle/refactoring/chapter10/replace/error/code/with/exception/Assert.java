package top.leagle.refactoring.chapter10.replace.error.code.with.exception;

public class Assert {
	static void isTrue(String comment, boolean test) {
		if (!test) {
			throw new RuntimeException("Assertion failed: " + comment);
		}
	}
}
