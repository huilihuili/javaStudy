package top.leagle.basic.staticT;

public class StaticTest5 {

	public static int i = 4;

	static {
		i = 5;
	}

	public static void main(String[] args) {
		System.out.println(StaticTest5.i);
	}
}
