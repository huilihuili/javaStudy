package top.leagle.basic;

class PackageTest {

}

public class FinallyTest {
	public static final int INT = 5;

	public static void main(String[] args) {
		System.out.println(inc());
		System.out.println(inc1());
	}

	public <T> void general(T t) {

	}

	public static int inc() {
		int x;
		try {
			x = 1;
			return x;
		} catch (Exception e) {
			x = 2;
			return x;
		} finally {
			x = 3;
		}
	}

	public static int inc1() {
		int x;
		try {
			x = 1;
			return x;
		} catch (Exception e) {
			x = 2;
			return x;
		} finally {
			x = 3;
			return x;
		}
	}
}
