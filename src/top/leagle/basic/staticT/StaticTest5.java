package top.leagle.basic.staticT;

public class StaticTest5 {

	static {
		i = 5;
	}

	public static int i = 4;

	public static void main(String[] args) {
		System.out.println(StaticTest5.i);
	}
}
