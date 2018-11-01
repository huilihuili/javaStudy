package top.leagle.thinking.chapter10;

public class Test1 {
	class Normal {

	}

	static class StaticClass {

	}

	public static void main(String[] args) {
		StaticClass staticClass = new StaticClass();
		Test1 test1 = new Test1();
		Normal normal2 = test1.new Normal();
	}
}
