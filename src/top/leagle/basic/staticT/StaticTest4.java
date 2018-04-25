package top.leagle.basic.staticT;

public class StaticTest4 {
	static {
		System.out.println("test static 1");
	}

	public static void main(String[] args) {

	}

	static {
		System.out.println("test static 2");
	}
}
