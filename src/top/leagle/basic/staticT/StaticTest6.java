package top.leagle.basic.staticT;

public class StaticTest6 {

	{
		System.out.println("Constructor");
	}
	static {
		System.out.println("static...");
	}

	public static void main(String[] args) {
		new StaticTest6();
		new StaticTest6();
	}
}
